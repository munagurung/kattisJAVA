package trivial;

import java.util.ArrayList;
import java.util.Scanner;

public class Cetvrta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> xList = new ArrayList<>();
		ArrayList<Integer> yList = new ArrayList<>();

		int i = 0;
		while (i < 3) {
			xList.add(sc.nextInt());
			yList.add(sc.nextInt());
			i++;
		}
		int x4, y4;

		int x1 = xList.get(0);
		int x2 = xList.get(1);
		int x3 = xList.get(2);

		int y1 = yList.get(0);
		int y2 = yList.get(1);
		int y3 = yList.get(2);

		if (x1 == x2) {
			x4 = x3;
		} else if (x1 == x3) {
			x4 = x2;
		} else {
			x4 = x1;
		}

		if (y1 == y2) {
			y4 = y3;
		} else if (y1 == y3) {
			y4 = y2;
		} else {
			y4 = y1;
		}

		System.out.println(x4 + " " + y4);
	}
}