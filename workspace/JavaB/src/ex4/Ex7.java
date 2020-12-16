package ex4;

public class Ex7 {
	
	public static void hello() {
		System.out.println("こんにちは");
	}

	public static void methodA () {
		System.out.println("methodA");
		methodB();
	}
	
	public static void methodB() {
		 System.out.println("MethodB");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		hello();
		
		methodA();
	}

}
