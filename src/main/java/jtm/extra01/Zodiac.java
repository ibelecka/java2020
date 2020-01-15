package jtm.extra01;

public class Zodiac {

	/**
	 * Determine the sign of the zodiac, use day and month.
	 * 
	 * @param day
	 * @param month
	 * @return zodiac
	 */
	public static String getZodiac(int day, int month) {
		String zodiac = null;
		switch (month) {
		case 1:
			if (day > 20) {
				zodiac = "Aquarius";
			} else {
				zodiac = "Capricorn";
			}
			break;
		case 2:
			if (day > 19) {
				zodiac = "Pisces";
			} else {
				zodiac = "Aquarius";
			}
			break;

		case 3:
			if (day > 21) {
				zodiac = "Aries";
			} else {
				zodiac = "Pisces";
			}
			break;
		case 4:
			if (day > 20) {
				zodiac = "Taurus";
			} else {
				zodiac = "Aries";
			}
			break;
		case 5:
			if (day > 21) {
				zodiac = "Gemini";
			} else {
				zodiac = "Taurus";
			}
			break;
		case 6:
			if (day > 21) {
				zodiac = "Cancer";
			} else {
				zodiac = "Gemini";
			}
			break;
		case 7:
			if (day > 23) {
				zodiac = "Leo";
			} else {
				zodiac = "Cancer";
			}
			break;
		case 8:
			if (day > 23) {
				zodiac = "Virgo";
			} else {
				zodiac = "Leo";
			}
			break;
		case 9:
			if (day > 23) {
				zodiac = "Libra";
			} else {
				zodiac = "Virgo";
			}
			break;
		case 10:
			if (day > 23) {
				zodiac = "Scorpio";
			} else {
				zodiac = "Libra";
			}
			break;
		case 11:
			if (day > 22) {
				zodiac = "Sagittarius";
			} else {
				zodiac = "Scorpio";
			}
			break;
		case 12:
			if (day > 22) {
				zodiac = "Capricorn";
			} else {
				zodiac = "Sagittarius";
			}
			break;
		}
		// TODO #1: Implement method which return zodiac sign names
		// As method parameter - day and month;
		// Look at wikipedia:
		// https://en.wikipedia.org/wiki/Zodiac#Table_of_dates
		// Tropical zodiac, to get appropriate date ranges for signs

		return zodiac;
	}

	public static void main(String[] args) {
		// HINT: you can use main method to test your getZodiac method with
		// different parameters
		System.out.println(getZodiac(21, 5));
	}

}
