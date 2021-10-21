package com.nagarro.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.dao.api.FlightDao;
import com.nagarro.dao.api.FlightRepo;
import com.nagarro.model.Flight;
import com.nagarro.model.FlightSearchRequestDto;

@Component
public class FlightDaoImpl implements FlightDao {

	@Autowired
	FlightRepo repo;

	@Override
	public List<Flight> getAvailableFlights(FlightSearchRequestDto dto) {
		String reqDepLocation = dto.getDepLocation();
		String reqArrLocation = dto.getArrLocation();
		Date reqDate = dto.getTravelDate();
		String reqFlightclass = dto.getFlightClass();
		List<Flight> list =(List<Flight>) repo.findAll();
		List<Flight> filterList =new ArrayList<>();
		if(!list.isEmpty()) {
		System.out.println("data entered");
		for(Flight f :list) {
			if(reqArrLocation.equalsIgnoreCase(f.getArrivalLoc())
					&& reqDepLocation.equalsIgnoreCase(f.getDepartureLoc())
					&& reqDate.equals(f.getDate())
					&& reqFlightclass.equalsIgnoreCase(f.getFlightClass())) {
				
				filterList.add(f);
			}
			
		}
		
		}
		
		return filterList;
	}

	@Override
	@Transactional
	public List<String> getArrivalLocations() {
		List<String> arrival = new ArrayList<>();
		Iterable<Flight> flights = repo.findAll();
		for (Flight f : flights) {
			arrival.add(f.getArrivalLoc());
		}
		return arrival;
	}

	@Override
	@Transactional
	public List<String> getDepartureLocations() {
		List<String> departure = new ArrayList<>();
		List<Flight> departurelist =(List<Flight>) repo.findAll();
		for (Flight f :departurelist) {
			departure.add(f.getDepartureLoc());
		}
		return departure;
	}

	@Override
	@Transactional
	public void saveFlight(Flight flight) {
		repo.save(flight);
		System.out.println("object saved");

	}

	@Override
	public void deleteAll() {
		repo.deleteAll();
	}

}
