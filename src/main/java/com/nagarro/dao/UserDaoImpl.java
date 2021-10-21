package com.nagarro.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.dao.api.FlightUserRepo;
import com.nagarro.dao.api.UserDao;
import com.nagarro.model.FlightUser;

@Component
public  class UserDaoImpl implements UserDao {
	
	@Autowired
	FlightUserRepo repo;
	@Override
	public boolean resetPassword(String username, String newPassword) {
		FlightUser u = repo.findById(username).get();
		u.setPassword(newPassword);
		repo.save(u);
		return true;
	}

	@Override
	public FlightUser getUser(String username) {
		
		Optional<FlightUser> user = repo.findById(username);
		FlightUser s = user.get();
		System.out.println("get user");
		return s;
	}

	@Override
	public boolean isUser(String username, String password) {
		if(repo.existsById(username)) {
			System.out.println("user exist");
			return true;
		}
		System.out.println("user not exist");
		return false;
	}

	@Override
	public void saveUser(FlightUser user) {
		repo.save(user);
		System.out.println("object inserted");
		
		
	}
	

}
