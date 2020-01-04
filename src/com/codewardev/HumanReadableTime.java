package com.codewardev;

// https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

public class HumanReadableTime {

	public static String makeReadable(int seconds) {
		
		String[] dividends = {"10", "6", ":", "10", "6", ":", "10", "10"};
		
		String hrt = "";
		for(int i=0; i<dividends.length; i++) {
			try {
				hrt = (seconds % Integer.valueOf(dividends[i])) + hrt;
				seconds /= Integer.valueOf(dividends[i]);
			} catch(NumberFormatException e) {
				hrt = dividends[i]+hrt;
			}
		}

		System.out.println("hrt: "+hrt);
		return hrt;
	}

}
