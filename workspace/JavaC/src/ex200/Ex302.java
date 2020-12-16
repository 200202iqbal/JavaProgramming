package ex200;

import java.util.Scanner;

public class Ex302 {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int num = 0;
		boolean iOk = false;
		
		int left = 7;
		int right = 9;
		
		System.out.println( left < right ? left - right : right - left);


		do
		{
		try {
		System.out.print("整数を入力 : ");
		//num = sc.nextInt(); これが無限に表示が続き
		num = Integer.parseInt(sc.nextLine());
		iOk = true;
		}
		catch (Exception e)
		{
			System.out.println("整数を入力してください");
		}

		}while(iOk == false);
			System.out.println("整数 " + num + " が入力されました。");
	}

}
