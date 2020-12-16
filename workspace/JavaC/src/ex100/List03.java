package ex100;

import java.util.ArrayList;
import java.util.List;

public class List03 {
	public static void main ( String[] args )
	{
		String[] str = new String[2];
		str[0] = "配列 1";
		str[1] = "配列 2";

		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println();

		List <String> list = new ArrayList< String >();
		list.add("配列 1");
		list.add("配列 2");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
