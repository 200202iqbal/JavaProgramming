package w3school;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		while (true)
		{
		Scanner inDay = new Scanner(System.in);
		int day = inDay.nextInt();
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("There is no option");

		}
		}
	}

}
