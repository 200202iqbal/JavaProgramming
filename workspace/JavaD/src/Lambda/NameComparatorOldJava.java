package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Member
{
	int id ;
	String name;
	public Member(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Member [ id = " + id + ", name = " + name + " ]";
	}
}

public class NameComparatorOldJava {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Member> list = Arrays.asList(new Member(115, "Tanaka"),
				new Member(120,"Kimura"),
				new Member(108,"Satou"),
				new Member(105, "Yamashita"),
				new Member(112, "Suzuki"));
		for (Member m : list )
		{
			System.out.println(m);
		}
		System.out.println();
		list.sort(new Comparator<Member>() {
				@Override
				public int compare(Member o1, Member o2)
				{
					String s1 = o1.name;
					String s2 = o2.name;
					return s1.compareTo(s2);
				}});
		for (Member m : list)
		{
			System.out.println(m);
		}
	}

}
