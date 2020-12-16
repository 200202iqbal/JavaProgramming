package ex01;

class Member 
{
	private int id = 10;
	String name = "aaa";
	public int getId() 
	{
		return this.id;
	}
	void Hello()
	{
		System.out.println("hello member");
	}
}

class Stu extends Member 
{
	int number = 999;
	void Hello()
	{
		System.out.println("hello stu");
	}
}
public class Reidai05 {

	public static void main(String[] args) {
		
		Member m1 = new Stu();
		System.out.println(m1.getId());
		System.out.println(((Stu)m1).number);

	}

}
