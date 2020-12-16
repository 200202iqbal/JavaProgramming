package ext4;

import java.util.Scanner;

public class Triangle2 {

	static double formula(double base, double height) {
		return 0.5 * (base * height);
	}

	public static void main(String[] args) {
		double base, height, area;

		Scanner scr = new Scanner(System.in);

		System.out.print("Base / ベース(cm) ? : ");
		base = scr.nextDouble();

		System.out.print("Height / 高さ(cm) ? : ");
		height = scr.nextDouble();

		area = formula(base, height);
		System.out.println("三角形の面積は " + area + "(cm)です。");
	}

}
