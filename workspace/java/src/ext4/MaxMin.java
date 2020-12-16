package ext4;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int a, b, c;

		System.out.print("a : ");
		a = scr.nextInt();

		System.out.print("b : ");
		b = scr.nextInt();

		System.out.print("c : ");
		c = scr.nextInt();

		System.out.println("最大は"+Math.max(a, Math.max(b, c))+ "です");
		System.out.println("最少は"+Math.min(a, Math.min(b, c))+ "です");
	}

}
