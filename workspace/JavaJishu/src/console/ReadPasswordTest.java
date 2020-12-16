package console;
import java.io.Console;
public class ReadPasswordTest {

	public static void main(String[] args) {
	
	
		Console cons = null;
		char[] password;
		System.out.println("Enter password : ");
		password = cons.readPassword();
		
		
		System.out.println("Password is : " + password );

	}

}

