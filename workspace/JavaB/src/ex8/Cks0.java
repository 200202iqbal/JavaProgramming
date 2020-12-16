package ex8;
// Studentクラス を定義してください  int id; String name のフィールド変数があります。
class Student {
	int id ;
	String name ;

	//このクラスに、idとnameを表示するprintId()のメソッド（戻り値なし、引数なし）を定義してください
	public void printId()
	{
	System.out.println(id + " " + name);	//static なし
	}

}





public class Cks0 {
	public static void main(String[] args) {
		// 200999 Yamamoto と200998 Tanakaの２人のインスタンスs1、s2を生成してください。
		Student s1 = new Student();
		s1.id = 200999; s1.name = "Yamamoto";

		Student s2 = new Student();
		s2.id = 200998 ; s2.name = "Tanaka";


		//２人のidとnameを、インスタンスメソッドprintId()を使って表示してください。
		s1.printId();
		s2.printId();
	}

}
