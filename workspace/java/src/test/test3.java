package test;

public class test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = makeString ( "x", 5);
		System.out.println(str);
	}

	public static String makeString ( String str, int n ) {
		String ret = "" ;
		for ( int j = 0 ; j < n ; j++ ) {
			ret+= str;
		}
		return ret;
	}
}
