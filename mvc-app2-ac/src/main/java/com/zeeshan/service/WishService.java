package com.zeeshan.service;

import java.util.Calendar;

public class WishService {

	public String generateWishMessage() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		String msg = null;
		if (hour <= 12) {
			msg = "GOOD MORNING";
		} else if (hour <= 16) {
			msg = "GOOD AFTERNOON";
		} else if (hour <= 20) {
			msg = "GOOD EVENING";
		} else {
			msg = "GOOD NIGHT!!!";
		}
		return msg;
	}
}
