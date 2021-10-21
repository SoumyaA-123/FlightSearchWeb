package com.nagarro.dao.api;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.model.Flight;
import com.nagarro.model.FlightSearchRequestDto;
@Component
public interface FlightDao {
	List<Flight> getAvailableFlights(FlightSearchRequestDto dto);

	List<String> getArrivalLocations();

	List<String> getDepartureLocations();
	public void saveFlight(Flight flight);
	public void deleteAll();

}
