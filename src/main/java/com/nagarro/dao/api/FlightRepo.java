package com.nagarro.dao.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.nagarro.model.Flight;

@Component
public interface FlightRepo extends CrudRepository<Flight, Integer> {

}
