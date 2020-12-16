package ex200;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest3 {

	public static void main (String [] args)
	{
		while(true)
		{
		try {
		System.out.print("入力値 : ");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();

		if (num == 1 )
		{
			throw new NumberFormatException();
		}
		else if ( num == 2 )
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else if (num == 3)
		{
			throw new InputMismatchException();

		}
		}
		catch ( NumberFormatException e)
		{
			System.out.println("NumberFormatExceptionの配下の例外をキャッチしました");
		}
		catch ( ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsExceptionの配下の例外をキャッチしました");
		}
		catch ( InputMismatchException e)
		{
			System.out.println("InputMismatchExceptionの配下の例外をキャッチしました");
		}
		System.out.println();
	}

	}
}
