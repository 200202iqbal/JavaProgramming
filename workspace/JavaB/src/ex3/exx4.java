package ex3;
import java.util.Scanner;
public class exx4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] id = { 200999, 200998, 200997 };
		String[] name  = { "Yamamoto", "Tanaka", "Yoshino"};

		for ( int i = 0; i < id.length ; i++)
		{
			System.out.println(id[i] + ", " + name[i]);
		}

		Scanner sc = new Scanner (System.in);
		System.out.print("id?");
		int num = sc.nextInt();
		boolean find = false;
		for ( int i = 0; i < id.length; i++)
		{
			if ( id [i] == num )
			{
				System.out.println(id[i] + ", " + name[i]);
				find = true;
			}
		}

		if ( find != true )
		{
			System.out.println("一致しませんでした");
		}


	}

}
