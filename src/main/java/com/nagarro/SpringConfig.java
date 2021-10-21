package com.nagarro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nagarro.dao.FlightFilesLoadDaoImpl;
import com.nagarro.dao.FlightLoaderDaoImpl;
import com.nagarro.dao.UserDaoImpl;
import com.nagarro.dao.api.FlightFilesLoadDao;
import com.nagarro.dao.api.FlightLoaderDao;
import com.nagarro.dao.api.UserDao;
import com.nagarro.services.FlightLoadServiceImpl;
import com.nagarro.services.UserServiceImpl;
import com.nagarro.services.api.FlightLoadService;
import com.nagarro.services.api.UserService;

@Configuration
@ComponentScan({ "com.nagarro" })
public class SpringConfig {
	@Bean
	public FlightLoadService flightLoadService() {
	    return new FlightLoadServiceImpl();
	}
	@Bean
	public FlightLoaderDao flightLoaderDao() {
	    return new FlightLoaderDaoImpl();
	}
	//FlightFilesLoadDao
	@Bean
	public FlightFilesLoadDao flightFilesLoadDao() {
	    return new FlightFilesLoadDaoImpl();
	}
	//FlightDaoImpl
//	@Bean
//	public FlightDao flightDao() {
//	    return new FlightDaoImpl();
//	}
	// UserDao
	@Bean
	public UserDao userDao() {
	    return new UserDaoImpl();
	}
	//user service
	@Bean
	public UserService userService() {
	    return new UserServiceImpl();
	}
	// LocationCodeLoadService
	

	}