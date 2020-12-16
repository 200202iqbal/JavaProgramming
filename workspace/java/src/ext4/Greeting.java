package ext4;
import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {

		String namae;
		Scanner scr = new Scanner ( System.in);

		System.out.print("名前は : ");
		namae = scr.nextLine();


		System.out.println("\nおはようございます " + namae + " さん。");
	}

}
