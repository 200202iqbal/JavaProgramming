package ext4;

import java.util.Scanner;

public class Sc9 {

	public static void main(String[] args) {

		final double phi = 3.14;
		int r;
		double s;

		Scanner sc = new Scanner(System.in);
		System.out.print("半径 = ");
		r = sc.nextInt();

		s = r * r * phi;
		System.out.print("円の面積 = " + s + " cm");

	}

}
