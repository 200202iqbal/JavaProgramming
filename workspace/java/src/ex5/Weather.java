package ex5;
import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("名前は");
		String name = sc.nextLine();
		System.out.println("おはよう、" + name + "さん、今日は雨ですね");

	}

}
