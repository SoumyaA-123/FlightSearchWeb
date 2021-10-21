package com.nagarro.util;

import java.util.Comparator;

import com.nagarro.model.Flight;

public class DurationSortCriteria implements Comparator<Flight> {

	public int compare(Flight o1, Flight o2) {

		return o1.getDuration().compareTo(o2.getDuration());
	}

}
