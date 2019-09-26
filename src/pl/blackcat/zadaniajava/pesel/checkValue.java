package pl.blackcat.zadaniajava.pesel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

class checkValue {

	static int getInteger(Scanner scanner) {
		while (true) {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Niepoprawny wybór. Spróbuj jeszcze raz: ");
				scanner.next();
			}
		}
	}

	static String checkDate(String date) {

/*
		int month_day = (int) date.charAt(2)-60;
		month_day=month_day % 2;
		date = date.substring(0,2)+month_day+ date.substring(3);
*/
		if (checkPesel.stringLenght(date, 6) && checkPesel.onlyNumbers(date) && checkDateCorrectness(date))
			return date;
		else
			return generatePesel.generateDate();


	}

	private static boolean checkDateCorrectness(String date) {
		try {
			SimpleDateFormat dateS = new SimpleDateFormat();
			dateS.applyPattern("yyMMdd");
			dateS.setLenient(false);
			Date dateF = dateS.parse(date);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}
}
