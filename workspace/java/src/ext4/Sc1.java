package ext4;

import java.util.Scanner;

public class Sc1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("名前は? : ");
		String name = sc.next();
		System.out.print("idは? : ");
		int id = sc.nextInt();
		System.out.println("入力された名前とidは " + name + " " + id);

	}
}
