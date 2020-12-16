package first;

public class Hello {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	System.out.println("Hello");
	String name = "先生";
	String message ;
	message = name +",こんにちは !!";
	System.out.println(message);
	String status = "生徒";
	System.out.println("私は " + status + "です");
	
	int A = 3;
	int B = 5;
	int M = Math.max(A,B);
	System.out.println("比較実験 : " + A + " と " + B + "で大きい方。。。" + M);
	
	int C =-100;
	System.out.println(Math.abs(C));
	
	}

}