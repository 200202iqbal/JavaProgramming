package w3school;

public class test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for ( int i = 0 ; i < 6 ; i ++ )
		{
			if ( i == 2 )
			{
				continue;
			}else if ( i == 4 )
			{
				break;
			}
			System.out.println(i);
		}
	}

}
