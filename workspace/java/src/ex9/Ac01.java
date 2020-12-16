package ex9;


public class Ac01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Access ac = new Access () ;
		System.out.println( " public = " + ac.pub);
		
		System.out.println("pkg private = " + ac.pkpri);
		// private アクセス
		//System.out.println("private = " + ac.pri);
		ac.printAccess();
		
	}

}
