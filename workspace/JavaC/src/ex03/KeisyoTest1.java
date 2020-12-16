package ex03;

class Animal1
{
	String voice ;
}

class Dog1 extends Animal1
{
	String kind;
}

class Cat1 extends Animal1
{
	String name;
}
public class KeisyoTest1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog1 dog = new Dog1 ();
		dog.voice = "ワンワン";
		dog.kind = "ゴールデンレトリバー";

		Cat1 cat = new Cat1();
		cat.voice = "ニャーニャー";
		cat.name = "タマ";


		System.out.println("犬の鳴き声は" + dog.voice);
		System.out.println("犬の種類は" + dog.kind);
		System.out.println();

		System.out.println("猫の鳴き声は " + cat.voice);
		System.out.println("猫の種類は" + cat.name);
		System.out.println();
	}

}
