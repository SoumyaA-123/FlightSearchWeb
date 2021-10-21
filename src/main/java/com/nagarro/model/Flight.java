package com.nagarro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "flightdetails")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FLIGHT_ID")
	private int flightId;
	@Column(name = "FLIGHT_NO")
	private String flightNo;

	@Column(name = "DEP_LOC")
	private String departureLoc;
	@Column(name = "ARR_LOC")
	private String arrivalLoc;

	@Column(name = "VALID_TILL")
	private Date date;
	@Column(name = "FLIGHT_TIME")
	private String time;
	@Column(name = "FLIGHT_DUR")
	private String duration;
	@Column(name = "FARE")
	private double fare;
	@Column(name = "SEAT_AVAILABILITY")
	private String seatAvailability;
	@Column(name = "CLASS")
	private String flightClass;

	public Flight() {
	}

	/**
	 * constructor
	 * 
	 * @param flightNo
	 * @param arrivalLoc
	 * @param departureLoc
	 * @param date
	 * @param time
	 * @param duation
	 * @param fare
	 * @param seatAvailability
	 * @param flightClass
	 */

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getArrivalLoc() {
		return arrivalLoc;
	}

	public void setArrivalLoc(String arrivalLoc) {
		this.arrivalLoc = arrivalLoc;
	}

	public String getDepartureLoc() {
		return departureLoc;
	}

	public void setDepartureLoc(String departureLoc) {
		this.departureLoc = departureLoc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getSeatAvailability() {
		return seatAvailability;
	}

	public void setSeatAvailability(String seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

}
