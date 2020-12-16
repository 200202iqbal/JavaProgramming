package ex2;

public class Ex4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for ( int i = 0; i < 10 ; i++)
		{
			if (i == 3 ) 
			{
			break;	
			}
			System.out.println( i + " ");
		}
		
		System.out.println("\ncontinueの場合");
		
		for ( int i = 0 ; i < 10 ; i++ )
		{
			if ( i == 3 )
			{
				continue;
			}
			System.out.println(i + " ");
		}
	}

}
