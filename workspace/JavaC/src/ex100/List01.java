package ex100;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main ( String[] args)
	{
		//ArrayList
		List<String> list = new ArrayList < String >();

		//要素のついかはadd()メソッドを用いる
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		list.remove(2); //menghapus value di list dengan index 2
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
