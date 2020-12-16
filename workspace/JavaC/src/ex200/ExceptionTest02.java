package ex200;

import java.util.Scanner;

public class ExceptionTest02 {

	public static void main (String[] args)
	{
		while(true)
		{
				try
				{
				System.out.print("入力してください : ");
				Scanner sc = new Scanner (System.in);
				int num = sc.nextInt();
				System.out.println("入力された数値は [ " + num + " ]");
				
				break;}
		catch(Exception e )
		{
			System.out.println("数値を入力してください");
		}
		}
	}

}
