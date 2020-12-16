package ex3;
import java.util.Scanner;
public class exx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);

		int[] input = new int [3];
		while (true) {
			System.out.println("0-2の数字を入力(終了は9 ; ");
			int num = sc.nextInt();
			if ( num == 0 )
			{
				input[0] = input[0] + 1;
			}else if ( num == 1)
			{
				input[1] = input[1] + 1;
			}else if ( num == 2 )
			{
				input[2] = input[2] + 1;
			}else if ( num == 9 )
			{
				break;
			}
		}
		for ( int i = 0; i < input.length; i++)
		{
			System.out.println(i + "は" + input[i] + "回");
		}
		System.out.println("入力されました");
	}

}
