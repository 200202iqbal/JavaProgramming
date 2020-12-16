package ex2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Time : ");
		int time = sc.nextInt();

		if (time < 12) {
			System.out.println("おはよう");

		}

		else if (time < 18) {
			System.out.println("こんにちは");

		} else if ( time <=24 )

		{
			System.out.println("こんばんわ");
		}else
		{
			System.out.println("Wrong Input");
		}

	}

}
