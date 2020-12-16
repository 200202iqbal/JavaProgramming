package ex200;

import java.util.Scanner;

public class Except01 {
	public static void main (String[] args)
	{
		for (;;)
		{
			try {
				Scanner scn = new Scanner (System.in);
				System.out.print("数字を入力 : ");
				int i = scn.nextInt();
				System.out.println("入力値は「 " + i + " 」です");
				}
			catch(Exception e)
			{
				System.out.println("catchブロックの処理です");
			}
			finally
			{
				System.out.println("finallyブロックの処理です");
			}
		System.out.println();
		}
	}
	}

