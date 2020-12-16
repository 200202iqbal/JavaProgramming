package ex3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner (System.in);
		System.out.print("Input ; ");
		int Opt = scn.nextInt();
		System.out.println();
		if ( Opt == 1 )
		{
			for ( int i = 0 ; i < 5; i++)
			{
				System.out.print(i);
				if ( i == 2 )
				{
					break;
				}
			}	
		}
		
		else if (Opt == 2)
		{
			for ( int i = 0 ; i < 5; i++)
			{
				System.out.print(i*2);
				if ( i == 2 )
				{
					break;
				}
			}	
			
		}
		
		else 
		{
			for ( int i = 0 ; i < 5; i++)
			{
				System.out.print(i*3);
				if ( i == 2 )
				{
					break;
				}
			}	
			
		}
		
	}

}
