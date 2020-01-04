package com.codewardev;

// https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

import java.sql.Time;
import java.time.Instant;

public class HumanReadableTime {

	public static String makeReadable(int seconds) {
		
		String[] divisor = {"10", "6", ":", "10", "6", ":", "10", "10"};
		
		Time a = new Time(seconds);
		System.out.println("minute: "+a.getSeconds());
		
		String hrt = "";
		for(int i=0; i<divisor.length; i++) {
			try {
				int x = Integer.valueOf(divisor[i]);
				hrt = (seconds % x) + hrt;
				seconds /= x;
			} catch(NumberFormatException e) {
				hrt = divisor[i]+hrt;
			}
		}

		return hrt;
	}

}
