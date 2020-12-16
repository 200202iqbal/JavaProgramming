package ex3;

public class exx6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = { 34, 56, 67, 23, 89, };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int sum = 0;
		int ave = 0;
		for (int point : arr) {
			sum = sum + point;

		}
		ave = sum / arr.length;
		System.out.println("平均は " + ave + " です。");

		int max = arr[0] ;
		int min = arr[0];
		
		for ( int i = 1 ; i < arr.length ; i++)
		{
			max = Math.max( max,  arr[i]);
			min = Math.min( min,  arr[i]);
			
			
		}
		
		System.out.println("最大は" + max);
		System.out.println("最小は" + min);
	}

}
