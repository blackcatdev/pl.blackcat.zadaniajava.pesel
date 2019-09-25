package pl.blackcat.zadaniajava.pesel;

class checkPesel {


	static int checkPesel(String pesel) {
		if (!peselLenght(pesel))
			return 1;
		if (!peselNumbers(pesel))
			return 2;
		if (!peselHashcode(pesel))
			return 3;
		return 0;

	}

	private static boolean peselLenght(String pesel) {
		return pesel.length() == 11;
	}

	private static boolean peselNumbers(String pesel) {
		for (int i = 0; i < pesel.length(); i++) {

			if (pesel.charAt(i) < '0' || pesel.charAt(i) > '9') {
				return false;
			}
		}
		return true;

	}

	private static boolean peselHashcode(String pesel) {
		int hashcode = (int) (pesel.charAt(0)) + (int) (3 * pesel.charAt(1)) + (int) (7 * pesel.charAt(2)) + (int) (9 * pesel.charAt(3)) + (int) (pesel.charAt(4)) + (int) (3 * pesel.charAt(5)) + (int) (7 * pesel.charAt(6)) + (int) (9 * pesel.charAt(7)) + (int) (pesel.charAt(8)) + (int) (3 * pesel.charAt(9)) + (int) (pesel.charAt(10));
		return (hashcode % 10) == 0;

	}


}
