package ext4;

import java.util.Scanner;

public class Sc2 {

	public static void main(String[] args) {

boolean chooseOption = true;
while (chooseOption) {

Scanner sc = new Scanner (System.in);
System.out.print("名前は? : ");
String name = sc.next();
System.out.print("idは? : ");
int id = sc.nextInt();

System.out.print("Return ? : (1 : Yes / 0 : No) " );
int option = sc.nextInt();

if(option == 1  ) {
	System.out.println("\nEntered\n");
}else
{
	chooseOption = false;
	System.out.println("\nProgram Exit...\n");
}
	}
	}
}
