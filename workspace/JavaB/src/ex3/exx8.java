package ex3;
import java.util.Scanner;
public class exx8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int input [] = new int [3];

		Scanner sc = new Scanner (System.in);

		while (true)
		{
		System.out.println("0-2を入力 ( 終了は 9) : ");
		int num = sc.nextInt();
		if ( num == 9)
		{
			break;

		}
		input[num] ++;

		}
		for (int i  = 0 ; i < input.length ; i++)
		{
			System.out.println( i + "は" + input[i] + "回");
		}
		System.out.println("入力されました");
	}
}
