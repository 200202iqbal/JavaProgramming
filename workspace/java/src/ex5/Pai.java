package ex5;

public class Pai {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double pai = 3.14;
		int en ; 
		en = (int)( pai); //cast
		System.out.println(en);
		
		///casting
		int price = 100;
		double tax = 0.1;
		int taxPay = (int)(price * tax);
		System.out.println(taxPay);
	}

}
