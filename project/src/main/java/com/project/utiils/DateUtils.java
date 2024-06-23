package com.project.utiils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtils {

	private static Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);

	public static String currentDate() {

		// Get the current date and time
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String currentDateTime = dateTime.format(formatter);

		return currentDateTime;
	}

	public static String expireDateForToken(String currentDate) {

		// Get the current date and time

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime expireDateTime = LocalDateTime.parse(currentDate, formatter).plusHours(24);

		String expireDate = expireDateTime.format(formatter);
		System.out.println("expireDate " + expireDate);
		return expireDate;
	}

}
