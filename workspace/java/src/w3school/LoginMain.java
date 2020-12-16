package w3school;
import java.util.Scanner;

public class LoginMain {
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
String Username = "admin";
String Password = "123";

Scanner input1 = new Scanner(System.in);
System.out.println("Enter Username : ");
String username = input1.next();

Scanner input2 = new Scanner(System.in);
System.out.println("Enter Password :");
String password = input2.next();

if (username.equals(Username) && password.equals(Password)) {
	System.out.println("Access Granted !");
}
else {
	System.out.println("Invalid");
}
	}

}
