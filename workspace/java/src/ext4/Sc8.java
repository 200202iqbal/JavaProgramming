package ext4;
import java.util.Scanner;

public class Sc8 {

	public static void main ( String[] args ) {

		String str1,str2, name;

		Scanner sc = new Scanner (System.in);

		//family name
		System.out.print ("Family Name ? ");
		str1 = sc.nextLine();

		//first name
		System.out.print("First Name ? ");
		str2 = sc.nextLine();

		//name

		name = str2 + " " + str1;
		System.out.println(name);

	}

}
