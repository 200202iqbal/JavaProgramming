import java.util.Scanner;

public class database {

	static String[] names = new String[3];
	static int[] ids = { 0,0,0};
	public static void main(String[] args) {
		
		inputData();
		printData();

	}

	public static void inputData() {
		
		System.out.println("input data !");
		
		Scanner sc = new Scanner ( System.in);
		
		for ( int i = 0 ; i < 3 ; i++)
		{
			System.out.println("input id :");
			ids[i] = Integer.parseInt(sc.nextLine());
			
			System.out.println("input name ;");
			names[i] = new String ( sc.nextLine());
			
		}
		
		System.out.println("... input done..");
	}
	
	public static void printData() {
		
		for (int i = 0 ; i < 3 ; i++)
		{
			System.out.println("ID " + ids[i]);
			
			System.out.println("Name " + names[i]);
		}
		
	}
}
