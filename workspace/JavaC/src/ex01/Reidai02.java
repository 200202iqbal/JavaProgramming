package ex01;

class A
{
	A()
	{
	System.out.println("Aクラスのデフォルトコンストラクタ");
	}

	A (int id)
	{
		System.out.println("Aくらすのコンストラクタ(int id)");
	}
}

class B extends A
{
	B()
	{
		System.out.println("Bクラスのデフォルトコンストラクタ");
	}

	B(int id)
	{
		super(id);
		System.out.println("Bクラスのコンストラクタ(int id) ");
	}
}

public class Reidai02 {


	public static void main(String[] args) {

		B b = new B();
		B b2 = new B(10);
	}

}
