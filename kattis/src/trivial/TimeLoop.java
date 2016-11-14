package trivial;

import java.util.Scanner;

public class TimeLoop {

	public static void main(String[] args) {
		// prompt input
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int magicNumber = sc.nextInt();
			int i;

			for (i = 1; i <= magicNumber; i++) {
				System.out.println(i + " Abracadabra");
			}

		}
	}
}