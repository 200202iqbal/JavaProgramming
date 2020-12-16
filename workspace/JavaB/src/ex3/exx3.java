package ex3;
import java.util.Random;
import java.util.Scanner;
public class exx3 {
	public static void main ( String[] args)
	{
		
		Scanner scn = new Scanner ( System.in );
		
		String[] fruit = {"リンゴ", "オレンジ", "バナナ" };
		
		for ( String fn : fruit)
		{
			System.out.println(fn);
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0 ; i < fruit.length ; i++ )
		{
			System.out.print(fruit[i] + ", ");
		}
		System.out.println();
		System.out.println();
		System.out.print ("Input number ; ");
		int i = scn.nextInt()-1;
		
		System.out.println(fruit[i]);
		System.out.println();
		System.out.println();
		
		int rnd = new Random().nextInt(3);
		System.out.println("おすすめは"+ fruit[rnd] + "ジュースです");
		
	}

}
