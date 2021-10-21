package com.nagarro.services.api;

import com.nagarro.model.FlightUser;

public interface UserService {
	boolean resetPassword(String username, String newPassword);

	FlightUser getUser(String username);

	boolean isValidUser(String username, String password);
	
	public void saveUser(FlightUser user) ;

}
