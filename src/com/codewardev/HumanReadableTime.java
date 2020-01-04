package com.codewardev;

// https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java


public class HumanReadableTime {

	public static String makeReadable(int seconds) {

		return String.format("%02d:%02d:%02d", (seconds/3600)%100, (seconds/60)%60, seconds%60);
	}

}
