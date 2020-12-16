package ex3;

import java.util.Scanner;

public class exx9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] str = new String[10];
		Scanner sc = new Scanner (System.in);
		int count = 0;
		while (true)
		{
			String input = sc.nextLine();
			
			if ( "end".equals(input))
			{
				break;
			}
			str[count] = input;
			count++;
			
		}
		
		for ( int i = 0 ; i < count ; i++)
		{
			System.out.println((i+1) + ":" + str[i]);
		}
	}

}
