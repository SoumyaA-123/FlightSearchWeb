package com.nagarro.services;

import java.util.Collections;
import java.util.List;

import org.eclipse.jdt.core.compiler.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.dao.api.FlightDao;
import com.nagarro.model.Flight;
import com.nagarro.model.FlightSearchRequestDto;
import com.nagarro.services.api.FlightService;
import com.nagarro.util.DurationSortCriteria;
import com.nagarro.util.FareDurationSortCriteria;
import com.nagarro.util.FareSortCriteria;

@Component
public class FlightServiceImpl implements FlightService{
	@Autowired
	FlightDao servicedao;
	
	@Override
	public List<Flight> getAvailableFlights(FlightSearchRequestDto dto) {
		List<Flight> availableFlights = servicedao.getAvailableFlights(dto);

		return availableFlights;
	
	}

	@Override
	public void sortFlights(List<Flight> availableFlights, String outputPref) throws InvalidInputException {
		try {
			if (outputPref.equalsIgnoreCase("fare")) {
				Collections.sort(availableFlights, new FareSortCriteria());
			} else if (outputPref.equalsIgnoreCase("duration")) {
				Collections.sort(availableFlights, new DurationSortCriteria());
			} else if (outputPref.equalsIgnoreCase("both")) {
				Collections.sort(availableFlights, new FareDurationSortCriteria());
			}
		} catch (Exception e) {
			throw new InvalidInputException("Please enter valid input");
		}

	}
		
	

	@Override
	public List<String> getDepLocations() {
		System.out.println("locations loaded");
		List<String> depLocations = servicedao.getDepartureLocations();
		return depLocations;
	}

	@Override
	public List<String> getArrLocations() {
		System.out.println("locations loaded");
		List<String> arrlocations = servicedao.getArrivalLocations();
		return arrlocations;
	}

}
