package ex1;
import java.util.Scanner;

public class Branchrep7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		System.out.println("Please input a, b , c ");
		String inString = sc.nextLine();
		switch (inString) {
		case "a":
			System.out.println("入力は a");
			break;
		case "b":
			System.out.println("入力は b");
			break;
		case "c":
			System.out.println("入力は c");
			break;
		default:
			System.out.println("a,b,c ではありません");
					
				
		}
	}

}
