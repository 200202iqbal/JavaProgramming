package ex4;

public class Ex4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = new int[] {34,56,67,23,89};
		int[] odd_arr = new int [arr.length];
		int[] even_arr = new int [arr.length];
		
		int cntodd = 0 ;
		int cnteven = 0 ;
		
		for ( int i  = 0 ; i < arr.length ; i ++ )
		{
			if ( (arr[i]%2) != 0 )
			{
				odd_arr [cntodd] = arr[i];
				cntodd++;
			}else
			{
				even_arr [cnteven] = arr[i];
				cnteven++;
			}
			
					
			
	}
		System.out.print("奇数は");
		for ( int i = 0; i < cntodd ; i ++)
		{
			System.out.print(odd_arr[i] +  ", ");
		}
		System.out.println();
		System.out.print("偶数は");
		for ( int i = 0; i < cnteven ; i ++)
		{
			System.out.print(even_arr[i] +  ", ");
		}
}}
