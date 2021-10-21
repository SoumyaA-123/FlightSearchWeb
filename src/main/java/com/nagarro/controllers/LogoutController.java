package com.nagarro.controllers;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.services.api.FlightLoadService;

@Controller
public class LogoutController {
	@Autowired
	private FlightLoadService flight;
	@RequestMapping("logout")
	public ModelAndView logout(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView();
		flight.deleteTable();
		mv.setViewName("index");
		System.out.println("You have been logged out successfully.");
		return mv;
	}

}
