package ex10;

class StudentCard {
	private int id ;
	public String name;
	
	StudentCard ( String name)
	{
		
		this.name = name;
	}
	
	StudentCard ()
	{
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
public class CapsuleTest1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StudentCard no1 = new StudentCard( "Iqbal");
		no1.setId(15);
		
		System.out.println("ID = " + no1.getId() + " name = " +  no1.name);
	}

}
