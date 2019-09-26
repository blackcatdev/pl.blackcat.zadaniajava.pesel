package pl.blackcat.zadaniajava.pesel;

import java.util.Random;
import java.util.Scanner;

class generatePesel {
	static void generatePesel() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj datę w formacie yymmdd lub zostaw puste pole dla wygenerowanych losowo: ");
		String date = checkValue.checkDate(scanner.nextLine());
		System.out.print("Podaj płeć (m/k): ");
		String gender = checkValue.checkGender(scanner.nextLine());
		String numbers = generatePesel.generateNumbers();
		String controlNumber = generatePesel.generateControlNumber(date, numbers, gender);
		String pesel = date + numbers + gender + controlNumber;
		System.out.println(pesel);
		peselStatus.peselStatus(checkPesel.checkPesel(pesel), pesel);


	}

	private static String generateControlNumber(String date, String numbers, String gender) {
		int controlNumber = 9 * Character.getNumericValue(date.charAt(0)) + 7 * Character.getNumericValue(date.charAt(1)) + 3 * Character.getNumericValue(date.charAt(2)) + Character.getNumericValue(date.charAt(3)) + 9 * Character.getNumericValue(date.charAt(4)) + 7 * Character.getNumericValue(date.charAt(5)) + 3 * Character.getNumericValue(numbers.charAt(0)) + Character.getNumericValue(numbers.charAt(1)) + 9 * Character.getNumericValue(numbers.charAt(2)) + 7 * Character.getNumericValue(gender.charAt(0));
		return Integer.toString(controlNumber % 10);
	}

	private static String generateNumbers() {
		Random random = new Random();
		return String.format("%03d", random.nextInt(1000));
	}

	static String generateDate() {
		Random intGenerator = new Random();
		String year = generateYear();
		String month = generateMonth();
		String day = generateDay(month);

		System.out.println();
		return year + month + day;
	}

	private static String generateDay(String month) {
		Random random = new Random();
		int monthI = Integer.parseInt(month);
		monthI = monthI % 20;
		if (monthI == 1 || monthI == 3 || monthI == 5 || monthI == 7 || monthI == 8 || monthI == 10 || monthI == 12)
			return String.format("%02d", random.nextInt(32));
		if (monthI == 4 || monthI == 6 || monthI == 9 || monthI == 11)
			return String.format("%02d", random.nextInt(31));
		if (monthI == 2)
			return String.format("%02d", random.nextInt(29));
		throw new RuntimeException("Błąd podczas generowania miesiąca!");

	}

	private static String generateMonth() {
		Random random = new Random();
		return String.format("%02d", random.nextInt(12) + 1 + random.nextInt(5) * 20);
	}

	private static String generateYear() {
		Random randomYear = new Random();
		return String.format("%02d", randomYear.nextInt(100));

	}

	static String generateGender() {
		Random random = new Random();
		return Integer.toString(random.nextInt(10));
	}

	static String generateGender(char gender) {
		Random random = new Random();
		if (gender == 'm')
			return Integer.toString(random.nextInt(5) * 2 + 1);
		if (gender == 'k')
			return Integer.toString(random.nextInt(5) * 2);
		else {
			System.out.println("Błędna płeć. Generuję losową.");
			return generateGender();
		}
	}
}
