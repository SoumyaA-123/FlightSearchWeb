package com.nagarro.controllers;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.model.FlightUser;
import com.nagarro.services.api.FlightLoadService;
import com.nagarro.services.api.FlightService;
import com.nagarro.services.api.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private FlightLoadService flightLoader;
	@Autowired
	private FlightService flight;

	@RequestMapping("/index")
	public ModelAndView home() throws IOException {
		ModelAndView mv = new ModelAndView("index");
		System.out.println("here");
		System.out.println("done");
		return mv;
	}

	@PostMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView("flight");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (!userService.isValidUser(username, password)) {
			mv.addObject("messageindex", "invalid user or password");
			mv.setViewName("index");
			System.out.println("user invalid");
			return mv;
		}
		flightLoader.loadFlights();
		List<String> arrLocationsduplicates = flight.getArrLocations();
		Set<String> arrLocations = new HashSet<>(arrLocationsduplicates);
		List<String> depLocationsduplicates = flight.getDepLocations();
		Set<String> depLocations = new HashSet<>(depLocationsduplicates);

		mv.addObject("username", username);
		mv.addObject("arrLocations", arrLocations);
		mv.addObject("depLocations", depLocations);
		mv.setViewName("flight");
		return mv;

	}

//	@PostMapping("/register")
//	public ModelAndView register(FlightUser user) {
//		ModelAndView mv = new ModelAndView("");
//		
//		
//		return mv;
//	}
	@PostMapping("register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String username = request.getParameter("username");
		String fullname = request.getParameter("fullname");
		String password = request.getParameter("password");
		FlightUser user = new FlightUser(username,fullname,password);
		userService.saveUser(user);
		mv.addObject("message","you are registered!!");
		System.out.println("registered");
		mv.setViewName("index");
		return mv;
	}

	@PostMapping("reset")
	public ModelAndView resetpassword(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String username = request.getParameter("username");
		String newpassword = request.getParameter("passwordnewconfirm");
		userService.resetPassword(username, newpassword);
		mv.addObject("message1", "password changed");
		System.out.println("password changed");
		mv.setViewName("index");
		return mv;

	}
}
