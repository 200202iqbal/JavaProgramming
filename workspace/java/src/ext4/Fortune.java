package ext4;
import java.util.Random;
import java.util.Scanner;

public class Fortune {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		String opt;
		String namae ;

		System.out.print("名前は : ");
		namae = scr.nextLine();

		System.out.println("1. 大吉 \n\n 2. 吉 \n\n 3. 区");
		int random = new Random().nextInt(3)+1;
		if ( random == 1) {
			 opt = "大吉";

		}else if ( random == 2 ) {
			 opt = "吉";

		}else {
			 opt ="区";

		}

		System.out.println("\n" + namae + "さんの運は " + opt + "です。");

	}

}
