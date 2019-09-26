package pl.blackcat.zadaniajava.pesel;

import java.util.Random;
import java.util.Scanner;

public class generatePesel {
	public static void generatePesel() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj datę w formacie yymmdd lub zostaw puste pole dla wygenerowanych losowo: ");
		String date = checkValue.checkDate(scanner.nextLine());



	}

	public static String generateDate() {
		Random intGenerator = new Random();

		System.out.println();
		return "data";
	}
}
