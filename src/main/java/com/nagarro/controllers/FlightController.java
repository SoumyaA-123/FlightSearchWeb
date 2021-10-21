package com.nagarro.controllers;

import java.util.Date;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.exceptions.InvalidInputException;
import com.nagarro.model.FlightSearchRequestDto;
import com.nagarro.services.api.FlightService;
import com.nagarro.util.DateParser;
@Controller
public class FlightController {
	@Autowired
	private FlightService flightService;
	Logger logger = LoggerFactory.getLogger(FlightController.class);
	
	
	@PostMapping("search")
	public ModelAndView getAvailableFlights(HttpServletRequest request, HttpServletResponse response)
			throws InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException {
		logger.info("Warn");
		ModelAndView mv = new ModelAndView();
		FlightSearchRequestDto dto = new FlightSearchRequestDto();

		String from = request.getParameter("from");
		String to = request.getParameter("to");
		
		String date = request.getParameter("date");
		Date validatedDate = DateParser.getValidatedDate(date);
		System.out.println(validatedDate);
		String flightclass = request.getParameter("flightclass");
		String outputPref = request.getParameter("sortBy");

		dto.setDepLocation(from);

		dto.setArrLocation(to);

		dto.setTravelDate(validatedDate);

		dto.setFlightClass(flightclass);

		dto.setOutputPreference(outputPref);

		List<com.nagarro.model.Flight> availableFlights = flightService.getAvailableFlights(dto);
		if (availableFlights.size() > 0) {
			flightService.sortFlights(availableFlights, outputPref);
		}
		mv.addObject("availableFlights", availableFlights);
		mv.setViewName("result");

		return mv;
	}


}
