package term2ReviewMondai;
// Studentクラス を定義してください

class Student

//フィールド(メンバ変数）にint id; String name を持たせます。
//インスタンスごとに個別の値を持つことができます。
{

	int id;
	String name;


// idとnameを引数とする、引数有のコンストラクタを作成してください
Student ( int id, String name)
{
	this.id = id ;
	this.name = name;
}
// 引数の無いコンストラクタを追記してください。
Student ()
{
	//何も書かないで
}
//このクラスに、idとnameを表示するメンバメソッドshowStudent()（戻値なし、引数なし）を定義してください
void showStudent()
{
	System.out.println( id + " " + name);
}
}

public class ObjName {
	public static void main(String[] args) {
		//引数なしのコンストラクタでインスタンスmemer1を作ってください。
		Student member1  = new Student() ;
		//member1のidに200999、nameに”Yamamoto”をセットしてください。
		member1.id = 200999;
		member1.name = "Yamamoto";

		//引数ありのコンストラクタで、id=200998 name＝”Tanaka”のインスタンスmember2を作ってください
		Student member2 = new Student ( 200998, "Tanaka");
		//インスタンスメソッドshowStudent()を使ってmember1を表示してください
		member1.showStudent();
		member2.showStudent();
		//member1のidを210999に変更してください
		member1.id = 210999;
		//インスタンスメソッドshowStudent()を使って変更後のmember1を表示してください
		member1.showStudent();
		//member2のidとnameをメソッドprintStudent()を使って表示してください
		printStudent(member2);
	}
	//メインメソッドがあるクラスのクラスメソッドの定義　引数あり　戻り値なし （static）
	//　クラス型　Student memを引数とし、★を頭につけて表示しましょう。
	public static void printStudent ( Student mem )
	{
		System.out.println("★ " + mem.id + " " + mem.name );
	}


}
