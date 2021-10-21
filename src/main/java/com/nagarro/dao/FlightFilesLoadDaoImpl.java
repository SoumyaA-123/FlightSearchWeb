package com.nagarro.dao;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.dao.api.FlightFilesLoadDao;

public class FlightFilesLoadDaoImpl implements FlightFilesLoadDao {
	public List<String> getFiles() {

		List<String> fileList = new ArrayList<String>();

		fileList.add(
				"C:\\Users\\sts\\FlightSearchWeb\\Files\\AirIndia.csv");
		fileList.add(
				"C:\\Users\\sts\\FlightSearchWeb\\Files\\indigo.csv");
		fileList.add(
				"C:\\Users\\sts\\FlightSearchWeb\\Files\\JetAir.csv");

		return fileList;
	}

}
