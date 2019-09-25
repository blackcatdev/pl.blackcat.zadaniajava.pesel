package pl.blackcat.zadaniajava.pesel;

import java.util.Scanner;

public class getPesel {
	public static String getPesel() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj pesel do sprawdzenia: ");
		return scanner.nextLine();
	}
}
