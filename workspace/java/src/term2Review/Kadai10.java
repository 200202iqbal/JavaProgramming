package term2Review;

import java.util.Scanner;

public class Kadai10 {

	public static void main(String[] args) {
		// 何月かの数字を渡すと、January, February,...,Decemberと英語を返すメソッドが
		//あります。これをメインメソッドから呼び出して英語の月の名前を表示してください。
		Scanner sc = new Scanner(System.in) ;
		System.out.print("何月を表示；");
		int inp = sc.nextInt();
		//　メソッドを呼び出してください
		String eMonth = getMonth(inp);
		System.out.println(inp + "月は" + eMonth + "です");

	}
	public static String getMonth(int inp) {
		String[] months= {"January"," February", "March"," April",
				"May", "June", "July", "August", "Septembef",
				"Octorber", "November", "December"};
		return months[inp - 1];
	}

}
