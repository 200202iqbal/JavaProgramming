package ex01;

//多態性・ポリモーフィズム/Polymorphism
class Person
{
	void work()
	{
		System.out.println("人です。仕事します");
	}
}

class Student extends Person
{
	void work()
	{
		System.out.println("学生です。勉強します。");
	}
}

class Teacher extends Person
{
	void work()
	{
		System.out.println("教員です。授業します。");
	}
}
public class Reidai04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();

		persons[0].work();
		persons[1].work();
		persons[2].work();
	}

}
