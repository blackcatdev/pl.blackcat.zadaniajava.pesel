package pl.blackcat.zadaniajava.pesel;

public class checkPesel {


	public static int checkPesel(String pesel) {
		if (!stringLenght(pesel,11))
			return 1;
		if (!onlyNumbers(pesel))
			return 2;
		if (!peselHashcode(pesel))
			return 3;
		if (!peselYear(pesel))
			return 4;
		return 0;

	}

	static boolean stringLenght(String string, int value) {
		return string.length() == value;
	}

	static boolean onlyNumbers(String string) {
		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) < '0' || string.charAt(i) > '9') {
				return false;
			}
		}
		return true;

	}

	private static boolean peselHashcode(String pesel) {
		int hashcode = (int) (pesel.charAt(0)) + (int) (3 * pesel.charAt(1)) + (int) (7 * pesel.charAt(2)) + (int) (9 * pesel.charAt(3)) + (int) (pesel.charAt(4)) + (int) (3 * pesel.charAt(5)) + (int) (7 * pesel.charAt(6)) + (int) (9 * pesel.charAt(7)) + (int) (pesel.charAt(8)) + (int) (3 * pesel.charAt(9)) + (int) (pesel.charAt(10));
		return (hashcode % 10) == 0;

	}

	private static boolean peselYear(String pesel) {
		return Integer.parseInt(pesel.substring(4, 6)) <= 31;
	}


}
