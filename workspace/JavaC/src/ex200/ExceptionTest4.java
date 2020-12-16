package ex200;

import java.util.Scanner;

public class ExceptionTest4 {

	public static void convert (String value) throws Exception
	{
		try {
		int num = Integer.parseInt(value);
		System.out.println("数字への変換成功 : " + num);
		}
		catch (Exception e)
		{
			throw new Exception("Exception void convert");
		}
	}
	public static void main (String[] args)
	{
		try
		{
			System.out.print("入力値 : ");
			Scanner scn = new Scanner (System.in);
			String value = scn.next();
			convert(value);
			throw new Exception("Exception void convert");
		}
		catch (NumberFormatException e)
		{

			System.out.println("NumberFormatExceptionが発生しました。");
			System.out.println("数字への変換に失敗しました");
		}
		catch (Exception p)
		{
			System.out.println("Exceptionが発生しました");
			p.printStackTrace();
		}
	}
}
