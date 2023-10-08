package de.dortmund.fh.project4;

public class StringCharaters {

	public static void main(String[] args) {

		String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		String[] texts = text.split(" ");
		String temp;
		for (int i = 0; i < texts.length; i++) {
			for (int j = i + 1; j < texts.length; j++) {
				if (texts[i].compareToIgnoreCase(texts[j]) > 0) {
					temp = texts[i];
					texts[i] = texts[j];
					texts[j] = temp;
				}
			}
		}
		for (String s : texts)
			System.out.print(s+" ");

	}

}
