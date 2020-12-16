package string;

import java.util.Arrays;
import java.util.Scanner;

public class String1 {
	public static void main(String[] args)
	{
		String s1 = "Hello";
		System.out.println(s1);
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		String s3 = s1.toLowerCase();
		System.out.println(s3);
		String s4 = new String("hello String");
		System.out.println(s4);

		char[] c = {'a','b','c','d'};
		for ( int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]);
		}
		String s5 = new String(c);
		System.out.println(s5);

		System.out.println(s5.charAt(2));
		System.out.println(s5.indexOf('a'));
		System.out.println(s5.indexOf('p'));
		System.out.println(s5.length());
		String s10 = "vgc";
		String s11 = "poc";
		System.out.println(s10.compareTo(s11));
		String s12  = "aaaabbbbccccdddd";
		System.out.println(s12.replace('b', 't'));
		System.out.println(s12.substring(5));
		String s22 = "#* ####";
		char[] chrs = s22.toCharArray();
		System.out.println(Arrays.toString(chrs));
		String s23 = "123";
		System.out.println(123  + Integer.parseInt(s23));
		System.out.println(String.valueOf(123) + Integer.parseInt(s23));
		int num = 100;
		System.out.println(num);
		System.out.println(String.format("フォーマット結果 : %05d", num));
		//%0d = 整数 %f5.3小数点  %s : 文字列
		String line = "abcd efgh/hijk lmno";
		String[] data = line.split("/");
		for (int i = 0 ; i < data.length ; i++ )
		{
			System.out.println( i + " " + data[i] );
		}

		Scanner scn = new Scanner (System.in);
		String a = scn.nextLine();
		String b = scn.nextLine();
		String d = scn.nextLine();

		String all = a + "/" +  b +"/" + d ;
		System.out.println(all);
	String[] result = all.split("/");
	for (int i = 0 ; i < result.length ; i++ )
	{
		System.out.println( i + " " + result[i] );
	}

	}

}
