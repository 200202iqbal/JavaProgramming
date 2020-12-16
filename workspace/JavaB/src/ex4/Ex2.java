package ex4;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] mul = new int [9][9];
		for ( int j = 0 ; j < 9 ; j ++ )
		{
			for ( int i = 0 ; i < 9 ; i ++ )
			{
				mul[j][i] = (j + 1 ) * (i + 1);
			}
		}
		for ( int j = 0 ; j < 9 ; j ++ ) {
			for (int  i = 0; i <  9 ; i ++ ) {
				System.out.print(mul[j][i] + "\t");
			}
			System.out.println();
		}

		Scanner sc = new Scanner (System.in);
		System.out.println("数字を２つ入力してください");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("計算結果は" +  mul[n1-1][n2-1]);
	}

}
