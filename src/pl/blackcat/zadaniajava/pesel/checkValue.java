package pl.blackcat.zadaniajava.pesel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class checkValue {

	public static int getInteger(Scanner scanner) {
		while (true) {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Niepoprawna liczba. Spróbuj jeszcze raz: ");
				scanner.next();
			}
		}
	}
}
