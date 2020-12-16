package ext6;
import java.util.Scanner ;

public class BR2 {

	public static void main (String[] args)
	{
		Scanner scn = new Scanner (System.in);
		System.out.print("number : ");
		int num = scn.nextInt();
		int kekka = num%2;

		if ( kekka == 0 ) // if ((num % 2) == 0){}
		{
			System.out.println("偶数です。");
			System.out.print("結果 " + 2*num);
		}else
		{
			System.out.println("偶数じゃないんです。");
			System.out.print("結果 " + num*num);
		}


	}

}
