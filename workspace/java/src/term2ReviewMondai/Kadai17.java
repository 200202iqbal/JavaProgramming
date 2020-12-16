package term2ReviewMondai;
//　クラスBankは、フィールド変数　int型yokin, String型name、をもち
//　コンストラクタBank(String name)と
//　メソッドinout(int money)を持ちます。　yokinはmoney分増加します。
class Bank {
	int yokin;
	String name;
	Bank(String name){
		this.name = name;
	}
	void inout(int money) {
		yokin += money;
	}
	void showYokin() {
		System.out.println(name + ":" +yokin);
	}
}
public class Kadai17 {

	public static void main(String[] args) {
		// ２つの銀行のインスタンスbk1、bk2を作成し、各々100、200を預金した後に、
		//　銀行１から50引き出し、銀行２に５０預金したとき　各銀行の残高をshouYokin()で表示してください
		//以下にプログラムを作成してください。
		Bank bk1 = new Bank ( "MUFG");
		Bank bk2 = new Bank ( "JP");
		
		bk1.inout(100);
		bk2.inout(200);
		bk1.showYokin();
		bk2.showYokin();
		bk1.inout(-50);
		bk2.inout(50);
		bk1.showYokin();
		bk2.showYokin();
		




	}

}
