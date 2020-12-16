package ex100;
import java.util.ArrayList;
import java.util.List;

class ClassA
{
	int id;
	ClassA(int id)
	{
		this.id = id ;
	}
	void printInfo()
	{
		System.out.println("id = " + id );
	}
}

public class List02 {
	public static void main ( String[] args )
	{
		//ArrayList
		List<ClassA> list = new ArrayList<ClassA>();
		list.add(new ClassA(13));

		ClassA a1 = new ClassA (15);
		list.add(a1);
		a1.printInfo();
		list.get(0).printInfo();
		list.get(1).printInfo();

		System.out.println();

		List <Integer> list1 = new ArrayList <Integer>();
		list1.add(1);
		list1.add(2);

		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println();

		List <String> list2 = new ArrayList <String>();
		list2.add("ab");
		list2.add("cd");
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println();

		List <Double> list3 = new ArrayList <Double>();
		list3.add(1.5);
		list3.add(5.2);

		System.out.println(list3.get(0));
		System.out.println(list3.get(1));
	}
}
