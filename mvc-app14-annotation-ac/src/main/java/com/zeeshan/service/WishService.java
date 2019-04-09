package com.zeeshan.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("ws")
public class WishService {

	public String generateWishMessage() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(cal.HOUR_OF_DAY);
		System.out.println("HOUR:----> " + hour);
		if (hour <= 12) {
			return "GOOD MORNING";
		} else if (hour <= 16) {
			return "GOOD AFTERNOON";
		} else if (hour <= 20) {
			return "GOOD EVENING";
		} else {
			return "GOOD NIGHT";
		}
	}
}
