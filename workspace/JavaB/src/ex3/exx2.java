package ex3;

public class exx2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = {12,34,56,78,90,9,87,65,43,21};

		for ( int i : arr)
		{
			System.out.print(i + " \t" );
		}


		System.out.println();


		for ( int i = arr.length-1 ; i >= 0   ; i-- )
		{
			System.out.print(arr[i] + " \t");
		}
		System.out.println();
		for ( int i : arr)
		{
			System.out.print(i*2 + " \t" );
		}

		System.out.println();
		for ( int i = 0 ; i <arr.length; i++)
		{
			int smallNum = Math.min(arr[0], arr[1]);
			arr[i]= smallNum;
			System.out.print(arr[i] + " \t" );
			arr[i++];
		}

	}

}
