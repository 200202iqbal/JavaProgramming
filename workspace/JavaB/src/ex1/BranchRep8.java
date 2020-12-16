package ex1;

import java.util.Scanner;

public class BranchRep8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		System.out.println("なんがつですか");
		int month = sc.nextInt();
 
		switch (month) {

		case 12:
		case 1:
		case 2 :
			System.out.println("冬");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;


		}
	}

}
