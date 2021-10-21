package com.nagarro.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.api.UserDao;
import com.nagarro.model.FlightUser;
import com.nagarro.services.api.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public boolean resetPassword(String username, String newPassword) {
		boolean status=userDao.resetPassword(username, newPassword);
		return status;
	}

	@Override
	public FlightUser getUser(String username) {
		FlightUser u = userDao.getUser(username);
		return u;
	}

	
	@Override
	public boolean isValidUser(String username, String password) {
		boolean isUser = userDao.isUser(username, password);
		FlightUser user = userDao.getUser(username);
		if (isUser) {
			if(user.getPassword().equals(password)) {
			System.out.println("validated");
			return true;
			}
			
		}
		
		return false;
	}

	@Override
	public void saveUser(FlightUser user) {
		userDao.saveUser(user);
		
		
	}

}
