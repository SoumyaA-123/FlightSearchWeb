package com.nagarro.services.api;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public interface FlightLoadService {
	public void loadFlights() throws IOException;
	public void deleteTable() ;

}
