package pl.blackcat.zadaniajava.pesel;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Wybierz, co chcesz zrobić:");
			System.out.println("1 - sprawdź poprawność numeru pesel");
			System.out.println("0 - zakończ program");
			System.out.print("Twój wybór: ");
			int wybor = checkValue.getInteger(scanner);

			switch (wybor) {
				case 1:
					String pesel=getPesel.getPesel();
					peselStatus.peselStatus(checkPesel.checkPesel(pesel),pesel);
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Nieporawny wybór. Spróbuj jeszcze raz.");

			}


		}
	}
}
