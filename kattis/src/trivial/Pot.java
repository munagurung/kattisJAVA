package trivial;

import java.util.ArrayList;
import java.util.Scanner;

public class Pot {

	public static void main(String[] args) {
		// instantiated the input prompt
		Scanner sc = new Scanner(System.in);

		// store the unformatted number in the array list
		ArrayList<Integer> unformattedNumberList = new ArrayList<>();

		// the number of integers that the user is going to input
		int numberOfIntegers = sc.nextInt();

		// i for loop counter and pot for calculating the final pot value
		int i, pot = 0;

		// prompt user to input integer and store them in the array list
		for (i = 0; i < numberOfIntegers; i++) {
			unformattedNumberList.add(sc.nextInt());
		}

		// go through the array list
		// separate the integer into two parts i.e. number and power
		// calculate their values using Math.pow() method
		// then add the result into the final pot variable in order to calculate
		// the sum
		for (i = 0; i < numberOfIntegers; i++) {
			String s = unformattedNumberList.get(i).toString(); // needed to
																// split the
																// integer
			// char[] unformattedChar = s.toCharArray(); // convert the char to
			// find the number and power part

			// get the number part for the given integer
			int beginIndex = 0;
			int endIndex = s.length() - 1;

			String a = s.substring(beginIndex, endIndex);

			// get the power part for the given integer
			char pow = s.charAt(s.length() - 1);

			int integer = Integer.parseInt(a); // convert string into int for
												// number part
			int power = Character.getNumericValue(pow); // convert char power
														// into int
			int formattedNumber = (int) Math.pow(integer, power); // calculate
																	// the
																	// formatted
																	// number
			pot += formattedNumber; // calculate the sum of the formatted
									// numbers
		}
		System.out.println(pot);
	}
}
