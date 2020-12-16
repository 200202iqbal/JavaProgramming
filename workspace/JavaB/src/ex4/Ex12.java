package ex4;

public class Ex12 {

	public static int add ( int x , int y )
	{
		int ans = x + y ;
		return ans;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 100;
		int y = 10;
		int ret = add (x,y);
		System.out.println( ret );
		System.out.println(add(add(5,5), add(10,5)));
	}

}
