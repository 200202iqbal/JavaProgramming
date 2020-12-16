package ex4;

public class Ex3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = new int[] {34,56,67,23,89};
		
		
		
		int cntA = 0;
		for ( int i = 0 ; i < arr.length ; i ++ )
		{
			
			if (( arr[i]%2) != 0)
			{
				System.out.println("奇数 " + arr[i] + ", ");
				cntA++;
			}
		}
		System.out.println();
		
		int cntB= 0;
		for ( int i = 0 ; i < arr.length; i ++)
		{
			if ((arr[i] % 2 ) == 0 )
			{
				System.out.println("偶数 " +arr[i] + ", ");
				cntB++;
			}
		}
		System.out.println();
		
		System.out.println( "奇数の個数は " + cntA + ", 偶数の個数は " + cntB  );
		
		System.out.println("===============================");
		
		
			 
	 }
	}


