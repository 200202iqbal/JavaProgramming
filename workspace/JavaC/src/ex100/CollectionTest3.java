package ex100;
import java.util.HashSet;
import java.util.Set;

public class CollectionTest3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set <Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);

		System.out.println(set1);
		for ( Integer num : set1)
		{
			System.out.println(num);
		}
		System.out.println();

		Set<String>set2 = new HashSet <String>();
		set2.add("SetA");
		set2.add("SetB");
		set2.add("SetC");
		set2.add("SetD");
		set2.add("SetE");

		for (String str : set2)
		{
			System.out.println(str);
		}
	}

}
