package w3school;
import java.util.Scanner;

public class checkAge {
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Age : ");
		int age = scn.nextInt();
		
		checkAge(age);
		

	}
	static void checkAge (int age)
	{
		if (age < 18 )
		{
			System.out.println("Access denied");
		}
		else 
		{
			System.out.println("Access Granted");
			boolean a = true;
		}
	}

}
