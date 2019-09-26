package pl.blackcat.zadaniajava.pesel;

class peselStatus {
	static void peselStatus(int status, String pesel) {
		if (status == 1)
			System.out.println("Pesel ma niepoprawną ilość znaków. Spodziewano się 11, wpisano " + pesel.length() + ".\n");

		if (status == 2)
			System.out.println("W peselu znaleziono niedozwolony znak.\n");

		if (status == 3)
			System.out.println("Nie zgadza się suma kontrolna peselu.\n");

		if (status == 4)
			System.out.println("Nie ma tyle dni w miesiącu. ;)\n");

		if (status == 0)
			System.out.println("Pesel jest poprawny.\n");


	}
}
