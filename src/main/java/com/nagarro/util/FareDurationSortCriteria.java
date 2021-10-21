package com.nagarro.util;

import java.util.Comparator;

import com.nagarro.model.Flight;

public class FareDurationSortCriteria implements Comparator<Flight> {

	public int compare(Flight o1, Flight o2) {

		double result = o1.getFare() - o2.getFare();
		if (0 == result) {
			result = o1.getDuration().compareTo(o2.getDuration());
		}
		return (int) result;
	}

}
