package de.dortmund.fh.project2;

public class Primes {

	public static void main(String[] args) {

		int nValues = 50;
		OuterLoop: for (int i = 2; i <= nValues; i++) {
			for (int j = 2; j <= (int) Math.sqrt(i); j++) {
				if (i % j == 0) {
					continue OuterLoop;
				}
			}
			System.out.print(i + " ");
		}

	}

}
