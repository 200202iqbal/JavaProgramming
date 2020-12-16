package ext4;

import java.util.Scanner;

public class Sc3 {

	public static void main(String[] args) {

boolean chooseOption = true;
	while (chooseOption) {

		Scanner sc = new Scanner (System.in);

		System.out.print("名前は? : ");
		String name = sc.next();

		System.out.print("年齢は? : ");
		int age = sc.nextInt();

		System.out.print("ようこそ。" + age + "歳の" + name + "さん。");

		System.out.print("\n\n.\n.Return ? : (1 : Yes / 0 : No) " );
		int option = sc.nextInt();

			if(option == 1  ) {
				System.out.println("\nProgram In...\n");
			}else if (option == 0)
			{
				chooseOption = false;
				System.out.println("\nProgram Exit...\n");
			}
						}
										}
			}
