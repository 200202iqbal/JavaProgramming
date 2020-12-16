package ex9;

class StudentCard
{
	int id;
	String name;


	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void printInfo()
{
	System.out.println("super" + id + " " + name);
}
	 
}



class I_StudentCard extends StudentCard {
	String nationality;
	
	public void ShowAllInfo()
	{
		printInfo();
		System.out.println(nationality);
	}
}

//class J_StudentCard extends StudentCard {
//	String schools;
//	public void ShowAllInfo()
//	{
//		printInfo();
//		System.out.println(schools);
//	}
//}

public class Inheri01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		I_StudentCard is1 = new I_StudentCard();
		is1.id = 200; is1.name = "Iqbal";
		is1.nationality = "Indonesia";
		
		is1.ShowAllInfo();
		
//		J_StudentCard js1 = new J_StudentCard();
//		js1.id = 100; js1.name = "bale";
//		js1.schools = "YSE";
//		js1.ShowAllInfo();
		
		
		
	}

}
