package ex3;

class Student {
	int id ;
	String name;
	
	//constructor
	
	Student(int id, String name) {
		this.id = id ;
		this.name = name ;
	}
}
public class StudentCard {

	public static void main(String[] args) {
		
		Student a = new Student(1234, "Muhammad Iqbal");
		System.out.println(a.id);
		System.out.println(a.name);

	}

}
