package ext4;
import java.util.Scanner;

public class Sc7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner (System.in);

		System.out.print("あなたは何歳ですか？");
		String ageStr = sc.nextLine();
		//int age = Integer.parseInt(ageStr);
		System.out.println("あなたは " + ageStr + " 歳です。");
		System.out.println("あなたの年齢の2倍は " + Integer.parseInt(ageStr)*2 + " 歳です。");
	}

}
