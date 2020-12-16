package ex5;
import java.util.Random;
import java.util.Scanner;

public class Rnd {

	public static void main(String[] args) {
	 	int r = new Random().nextInt(5) + 1;
	    System.out.println(r);
	    
	    Scanner sc = new Scanner (System.in);
	    int a = sc.nextInt();
	    int h = sc.nextInt();
	    
	    System.out.println(a*h/2.0);
	    String dummy = sc.nextLine();
	    String str1 = sc.nextLine();
	    int b = Integer.parseInt(str1);
	    String str2 = sc.nextLine();
	    System.out.println(str1 + str2);
	    }

}
