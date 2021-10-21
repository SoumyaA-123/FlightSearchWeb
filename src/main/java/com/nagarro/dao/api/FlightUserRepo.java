package com.nagarro.dao.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.nagarro.model.FlightUser;

//@Repository
@Component
public interface FlightUserRepo extends CrudRepository<FlightUser, String> {

}
