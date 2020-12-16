package ex03;

class Animal2
{
	void voice()
	{
		System.out.println("動物の鳴き声です");
	}
}

class Dog2 extends Animal2
{
	void voice ()
	{
		System.out.println("ワンワン");
	}
}

class Cat2 extends Animal2
{

	void voice ()
	{
		super.voice();
		System.out.println("ニャーニャー");
	}
}

class Cow extends Animal2
{
	void voice ()
	{
		super.voice();
		System.out.println("モーモー");
	}
}
public class KeisyoTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal2 animal = new Animal2();
		animal.voice();
		System.out.println();
		Dog2 dog = new Dog2();
		dog.voice();
		System.out.println();
		Cat2 cat = new Cat2();
		cat.voice();

		System.out.println();
		Cow cow = new Cow();
		cow.voice();
	}

}
