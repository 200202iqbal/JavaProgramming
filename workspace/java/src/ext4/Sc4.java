package ext4;

//import java.util.Scanner;

public class Sc4 {

	public static void main(String[] args) {

boolean chooseOption = true;
	while (chooseOption) {

		//Scanner sc = new Scanner (System.in);

		System.out.print("名前は? : ");
		String name = new java.util.Scanner(System.in).next();

		System.out.print("年齢は? : ");
		int age = new java.util.Scanner(System.in).nextInt();

		System.out.print("ようこそ。" + age + "歳の" + name + "さん。");

		System.out.print("\n\n.\n.Return ? : (1 : Yes / 0 : No) " );
		int option = new java.util.Scanner(System.in).nextInt();

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
