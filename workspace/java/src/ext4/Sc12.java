package ext4;
import java.util.Random;
import java.util.Scanner;

public class Sc12 {

	public static void main(String[] args) {

		String[] place = {"ハワイ", "パリ", "ローマ"};
		/*String nmb1 = "ハワイ";
		String nmb2 = "パリ";
		String nmb3 = "ローマ";*/


		System.out.println("いきたいところを3か所入力してください");
		Scanner sc = new Scanner ( System.in);
		System.out.println("一番目 ?");
		String place1 = sc.nextLine();
		System.out.println("二番目 ?");
		String place2 = sc.nextLine();
		System.out.println("三番目 ?");
		String place3 = sc.nextLine();

		int rn = new Random().nextInt(3) + 1 ;
		System.out.print("おすすめは " + rn + "番目です。");

	}

}
