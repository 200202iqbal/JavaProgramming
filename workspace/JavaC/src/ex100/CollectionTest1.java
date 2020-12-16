package ex100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayClass
{
	int arrayNo;

	public ArrayClass (int num)
	{
		this.arrayNo = num;
	}

	public void printArray()
	{
		System.out.println("ArrayListでArrayClassを作成します : " + this.arrayNo);
	}
}

public class CollectionTest1 {
	public static void main ( String[] args )
	{
		String[] values = new String[3];
		values[0] = "配列1";
		values[1] = "配列2";
		values[2] = "配列3";

		for (int i = 0 ; i< values.length ; i++ )
		{
			System.out.println(values[i]);
		}

		System.out.println();

		//ArrayList
		List <String> list1 = new ArrayList <String>();
		list1.add("Array 1");
		list1.add("Array 2");
		list1.add("Array 3");

		for ( int i = 0 ; i < list1.size() ; i++)
		{
			System.out.println(list1.get(i));
		}

		System.out.println();

		List<Integer> list2 = new ArrayList <Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);

		list2.remove(3);

		for ( int i = 0 ; i < list2.size() ; i++)
		{
			System.out.println(list2.get(i));

		}

		System.out.print("Mencari nilai 4 dalam list2 menggunakan contain :");
		System.out.println(list2.contains(4));

		System.out.print("Mencari nilai 4 dalam list2 menggunakan contain : ");
		System.out.println(list2.contains(3));

		System.out.print("Mencari index dengan value 3 ");
		System.out.println(list2.indexOf(3));

		System.out.println();
		list2.set(0, 7);
		System.out.println(list2.get(0));

		//list2.sort(Comparator.naturalOrder()); mengurutkan data dari terkecil ke terbesar
		//list2.sort(Comparator.reverseOrder()); mengurutkan data dari terbersar ke terkecil

		Scanner sc = new Scanner (System.in);
		int b = 2;
		list2.set(sc,b);

		ArrayClass a1 = new ArrayClass(1);

		List <ArrayClass> list3 = new ArrayList <ArrayClass>();
		list3.add(a1);
		list3.add(new ArrayClass(2));

		for ( int i = 0 ; i < list3.size() ; i++)
		{
			list3.get(i).printArray();
		}



	}
}
