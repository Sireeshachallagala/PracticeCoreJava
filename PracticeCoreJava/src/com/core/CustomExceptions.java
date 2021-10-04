package com.core;

import java.util.ArrayList;

public class CustomExceptions {

	public static void main(String[] args) {
		ArrayList<String> days=new ArrayList<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		String day="Sunday";
		if(!days.contains(day)) {
			try {
				throw new DayNotAvailableException("Day not available",day);
			}catch(DayNotAvailableException e) {
				e.getLocalizedMessage();
                e.printStackTrace();
			}
		}
	}

}
