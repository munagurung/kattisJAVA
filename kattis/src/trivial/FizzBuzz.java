package trivial;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int N = sc.nextInt();
			fizzbuzz(X, Y, N);
		}
	}

	private static void fizzbuzz(int X, int Y, int N) {
		int i;
		for (i = 1; i <= N; i++) {
			if (i % X == 0 && i % Y == 0) {
				System.out.println("FizzBuzz\n");
			} else if (i % X == 0) {
				System.out.println("Fizz\n");
			} else if (i % Y == 0) {
				System.out.println("Buzz\n");
			} else {
				System.out.println(i + "\n");
			}
		}
	}
}
