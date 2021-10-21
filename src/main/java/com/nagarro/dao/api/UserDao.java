package com.nagarro.dao.api;

import com.nagarro.model.FlightUser;

public interface UserDao {
	boolean resetPassword(String username, String newPassword);

	FlightUser getUser(String username);

	boolean isUser(String username, String password);
	
	public void saveUser(FlightUser user) ;

}
