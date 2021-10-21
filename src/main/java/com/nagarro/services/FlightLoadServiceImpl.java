package com.nagarro.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.FlightDaoImpl;
import com.nagarro.dao.api.FlightLoaderDao;
import com.nagarro.services.api.FlightLoadService;

public class FlightLoadServiceImpl implements FlightLoadService {

	@Autowired
	private FlightLoaderDao flightLoaderDao;
	@Autowired
	private FlightDaoImpl flightDao;
	
	

	public void loadFlights() throws IOException {

		System.out.println("in flightLoader");
		flightLoaderDao.addFlights();

	}

	@Override
	public void deleteTable() {
		flightDao.deleteAll();

	}

}
