package com.nagarro.util;

import java.util.Comparator;

import com.nagarro.model.Flight;

public class FareSortCriteria implements Comparator<Flight> {

	public int compare(Flight o1, Flight o2) {

		return (int) (o1.getFare() - o2.getFare());
	}

}

