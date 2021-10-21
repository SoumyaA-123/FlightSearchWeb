package com.nagarro.model;
import java.util.Date;

public class FlightSearchRequestDto {

	private String depLocation;

	private String arrLocation;

	private Date travelDate;

	private String flightClass;

	private String outputPreference;

	public FlightSearchRequestDto(String depLocation, String arrLocation, Date travelDate, String flightClass,
			String outputPreference) {
		super();
		this.depLocation = depLocation;
		this.arrLocation = arrLocation;
		this.travelDate = travelDate;
		this.flightClass = flightClass;
		this.outputPreference = outputPreference;
	}

	public FlightSearchRequestDto() {

	}

	public String getDepLocation() {
		return depLocation;
	}

	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}

	public String getArrLocation() {
		return arrLocation;
	}

	public void setArrLocation(String arrLocation) {
		this.arrLocation = arrLocation;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public String getOutputPreference() {
		return outputPreference;
	}

	public void setOutputPreference(String outputPreference) {
		this.outputPreference = outputPreference;
	}

}

