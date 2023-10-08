package de.dortmund.fh.project3;

public class StringCharaters {

	public static void main(String[] args) {

		String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		text = text.toLowerCase();
		int spaces = 0;
		int vowels = 0;
		int letters = 0;
		int eachChar = 0;
		char c = 'A';
		for (int i = 0; i < text.length(); i++) {

			c = text.charAt(i);
			eachChar = (int) c;
			if (c == ' ')
				spaces++;
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			}
			if (eachChar >= 97 && eachChar <= 122) {
				letters++;
			}

		}

		System.out.println("The text contained vowels: " + vowels + "\n" + "consonants: " + (letters - vowels) + "\n"
				+ "spaces: " + spaces);

	}

}
