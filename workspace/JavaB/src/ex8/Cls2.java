package ex8;
//  String型のバイト先の名前(name）とint型の時給(pay)と交通費（cost)を持つクラスworkを定義してください。


class Work {
	String name ;
	int pay ;
	int cost;
	
	
}
public class Cls2 {

	public static void main(String[] args) {
		// バイト先３つのインスタンスを生成してください (名前、時給、交通費）とします
		// (AA, 1000, 200), (BB,1200. 500) , (CC, 1150, 300)　名前と時給
		Work w1 = new Work();
		w1.name = "AA"; w1.pay = 1000; w1.cost = 200;
		
		
		Work w2 = new Work();
		w2.name = "BB" ; w2.pay = 1200; w2.cost = 500;
		
		Work w3 = new Work();
		w3.name = "CC" ; w3.pay = 1150; w3.cost = 300;
		
		System.out.println(w1.pay * 3 + " " + w2.pay * 3 + " " + w3.pay * 3);

		//各々のバイト先で、３時間働いたときに支払われる給与を表示してください。

		//３時間働いたとき、時給から交通費を引いたお金が最も大きいバイト先を表示してください。
		System.out.println((w1.pay * 3 - w1.pay) + " " + (w2.pay * 3 - w2.pay) + " " +( w3.pay * 3 - w3.pay));


	}

}
