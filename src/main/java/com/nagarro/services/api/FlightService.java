package com.nagarro.services.api;

import java.util.List;

import org.eclipse.jdt.core.compiler.InvalidInputException;

import com.nagarro.model.Flight;
import com.nagarro.model.FlightSearchRequestDto;

public interface FlightService {
	List<Flight> getAvailableFlights(FlightSearchRequestDto dto);

	void sortFlights(List<Flight> availableFlights, String outputPref) throws InvalidInputException;
	List<String> getDepLocations();

	List<String> getArrLocations();
	
}
