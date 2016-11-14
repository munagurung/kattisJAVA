package trivial;

import java.util.Scanner;

public class ColdputerScience {

	public static void main(String[] args) {
		// prompt the user for input
		Scanner sc = new Scanner(System.in);

		// variable to store numberOfTempLessThanZero
		int numberOfTempLessThanZero = 0;

		// save the user input
		int numberOfTemp = sc.nextInt();

		// check for temp input for a maximum of numberOfTemp times
		for (int i = 0; i < numberOfTemp; i++) {
			sc.hasNextInt();

			if (sc.nextInt() < 0) {
				numberOfTempLessThanZero += 1;
			}
		}
		// output the numberOfTempLessThanZero
		System.out.println(numberOfTempLessThanZero);
	}
}
