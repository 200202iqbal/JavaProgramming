package w3school;
import java.util.Scanner;

public class object {

	static boolean x ;

	static void umurCode (int umur)
	{
		 boolean y;
		
		if (umur < 18)
		{
			System.out.println("Access Denied");
		}else
		{
			System.out.println("Access OK");
			y = true;
		}
	}





	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		object myObj = new object();
//		myObj.x = true;
//		System.out.println(myObj.x);

		Scanner scn = new Scanner(System.in);
		System.out.print("Umur :");
		int umur = scn.nextInt();
		
		



	}

}
