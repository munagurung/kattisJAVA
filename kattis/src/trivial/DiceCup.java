package trivial;

import java.util.Scanner;

public class DiceCup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			diceCup(num1, num2);
		}
	}

	public static void diceCup(int num1, int num2) {
		int i, result;
		if (num1 >= num2) {
			result = num2;
			// num1 = 6, num2 = 4
			for (i = num2; i <= num1; i++) {
				result += 1;
				System.out.println(result);
			}
		} else {
			result = num1;
			// num1 = 12, num2 = 20
			for (i = num1; i <= num2; i++) {
				result += 1;
				System.out.println(result);
			}
		}
	}
}
