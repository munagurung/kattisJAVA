package trivial;

import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// variable to hold the number for current white pieces set
		int currentKingNumber = 1, currentQueenNumber = 1, currentRooksNumber = 2, currentBishopsNumber = 2,
				currentKnightsNumber = 2, currentPawnsNumber = 8;

		// variable to hold the number for new white pieces set
		int newKingNumber = 1, newQueenNumber = 1, newRooksNumber = 2, newBishopsNumber = 2, newKnightsNumber = 2,
				newPawnsNumber = 8;

		// get input from user and save them to appropriate variables
		// while(sc.hasNextInt())
		currentKingNumber = sc.nextInt();
		currentQueenNumber = sc.nextInt();
		currentRooksNumber = sc.nextInt();
		currentBishopsNumber = sc.nextInt();
		currentKnightsNumber = sc.nextInt();
		currentPawnsNumber = sc.nextInt();

		// calculate the number of set needed to be added or removed

		newKingNumber = 1 - currentKingNumber;

		newQueenNumber = 1 - currentQueenNumber;

		newRooksNumber = 2 - currentRooksNumber;

		newBishopsNumber = 2 - currentBishopsNumber;

		newKnightsNumber = 2 - currentKnightsNumber;

		newPawnsNumber = 8 - currentPawnsNumber;

		// print out result after calculation
		System.out.println(newKingNumber + " " + newQueenNumber + " " + newRooksNumber + " " + newBishopsNumber + " "
				+ newKnightsNumber + " " + newPawnsNumber);
	}
}