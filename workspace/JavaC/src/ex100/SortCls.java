package ex100;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Test implements Comparable <Test>
{
	int id;
	String name;
	
	Test (int id, String name )
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return id + " " + name + " ";
	}
	
	@Override
	public int compareTo(Test o)
	{
		return this.name.compareTo(o.name);
	}
}

class idComp implements Comparator<Test>
{
	public int compare (Test o1, Test o2)
	{
		return o1.age - o2.age;
	}
}
public class SortCls {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Test mem1 = new Test(100 , "CCC");
		Test mem2 = new Test (300, "AAA");
		Test mem3 = new Test (200, "BBB");
		
		List <Test> members = new ArrayList <Test>();
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		
		System.out.println(members);
		members.sort(Comparator.naturalOrder());
		System.out.println(members);
	}

}
