package trivial;

import java.util.Scanner;

public class Carrots {
	public static void main(String[] args) {
		// prompt input
		Scanner sc = new Scanner(System.in);

		// read input and call the method to calculate the number of
		// carrot won
		while (sc.hasNextInt()) {
			int people = sc.nextInt();
			int problemsSolved = sc.nextInt();
			System.out.println(problemsSolved);
		}
	}

	/*
	 * public static int carrotsWon(int people, int problemsSolved) { int
	 * carrotsWon;
	 * 
	 * // only one person and atleast one problem solved if (people == 1) {
	 * carrotsWon = problemsSolved; } else { carrotsWon = problemsSolved; }
	 * return carrotsWon; }
	 */
}