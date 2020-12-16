package ex10;

public class CapsuleTest2 {

	public static void main(String[] args) {
		StudentCard2 no1 = new StudentCard2();
		no1.id = 190500;
		//ここにsetter getter を呼び出して表示するプログラムを作成
		
		no1.setName("Bale");
		System.out.println("ID = " + no1.id + " \nName " + no1.getName());

	}

}

class StudentCard2
{
	int id ;
	private String name;
	
	public String getName() 
	{
		return name;
	}
	public void setName ( String name )
	{
		this.name = name;
	}
}
