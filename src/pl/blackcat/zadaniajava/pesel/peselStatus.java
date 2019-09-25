package pl.blackcat.zadaniajava.pesel;

public class peselStatus {
	public static void peselStatus(int status, String pesel) {
		if (status == 1)
			System.out.println("Pesel ma niepoprawną ilość znaków. Spodziewano się 11, wpisano " + pesel.length() + ".\n");

		if (status == 2)
			System.out.println("W peselu znaleziono niedozwolony znak.91\n");

		if (status == 3)
			System.out.println("Nie zgadza się suma kontrolna peselu.\n");

		if (status == 0)
			System.out.println("Pesel jest poprawny.\n");

	}
}
