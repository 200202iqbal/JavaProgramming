package ex200;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except02 {
	public static void main (String [] args)
	{
		try
		{
		String str = null;
		System.out.println(str.length());
		System.out.println();
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		/*finally
		{
			System.out.println("finallyブロックの処理です");
		}*/
		try {
		String[] strs = new String[1];
		strs[0]	= "要素1";
		strs[1] = "要素2";
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		/*finally
		{
			System.out.println("finallyブロックの処理です");
		}*/
		try
		{
			Scanner scn = new Scanner(System.in);
			System.out.print("入力 : ");
			int i = scn.nextInt();
			System.out.println("数字の入力は " + i);
		}
		catch(InputMismatchException e)
		{
		System.out.println(e);
		}
		finally
		{

		}
		try
		{
		String str = "あいうえお";
		Integer.parseInt(str);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		finally
		{

		}
	}

}
