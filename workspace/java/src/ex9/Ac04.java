package ex9;


class PersonalDB
{
	private int id ;
	private String name ;
	private int weight ;
	private int age ;

	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName ( String name )
	{
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	PersonalDB ( int id, String name , int weight , int age )
	{
		this.id = id ; this.name = name; this.weight = weight;
		this.age = age;
	}

	void showInfo()
	{
		System.out.println( id + " " + name + " " + weight + " " + age );
	}
}
public class Ac04 {

	public static void main(String[] args) {
		PersonalDB m1 = new PersonalDB(200, "Yama", 90, 60);
		PersonalDB m2 = new PersonalDB(300, "Tana" , 70, 40);
		m1.showInfo();
		m2.showInfo();
		
		m1.setAge(25); m1.setWeight(56);
		m1.setAge(36); m2.setWeight(70);

		m1.showInfo();
		m2.showInfo();
		
		String abc = "abc";
		System.out.println(abc.toString());
		System.out.println(abc.hashCode());

	}

}
