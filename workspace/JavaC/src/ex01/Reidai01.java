package ex01;
class StudentCard
{
	int id ; //フィールド変数 / メンバ変数
	String name;

	void printInfo() //メソッド（メンバメソッド)
	{
		System.out.println(this.id + "\n" + this.name);
		System.out.println("StudentClassのprintInfo");
	}
}

class IStudentCard extends StudentCard
{
	String nationality;
	void printInfo() //メソッド（メンバメソッド)
	{
		super.printInfo();
		System.out.println();
		System.out.println(this.id + "\n" + this.name + "\n" + this.nationality );
		System.out.println("IStudentClassのprintInfo");
	}
}

public class Reidai01 {

	public static void main(String[] args) {

		IStudentCard a = new IStudentCard()	;
		a.id = 2345;
		a.name = "Jhon Smith";
		a.nationality = "Inggris";
		a.printInfo();

	}

}