package ex7;
// リオオリンピックのメダル数は下記です。
/**		国　　  金　	銀　    銅メダル
1	アメリカ	 46	    37	    38
2	イギリス	 27	    23		17
3	中国	 	 26	    18		26
4	ロシア		 19	    17	    20
5	ドイツ		 17	    10		15
6	日本		 12　	 8	    21
  */
// 国名と金銀銅の各メダル数のクラス Medalsを作成してください
//  String型 nation , int 型　au, ag, cuのフィールド変数とします。
class Medals{
	String nation;
	int au;
	int ag;
	int cu;
}

public class Cla9 {

	public static void main(String[] args) {
		// 6つの国のMedal数のインスタンスを作成してください。配列を使う
		Medals[] mdl = new Medals[6];
		mdl[0] = new Medals();
		mdl[0].nation = "アメリカ"; mdl[0].au=46; mdl[0].ag=37; mdl[0].cu=38;
		mdl[1] = new Medals();
		mdl[1].nation = "イギリス"; mdl[1].au=27; mdl[1].ag=23; mdl[1].cu=17;
		mdl[2] = new Medals();
		mdl[2].nation = "中国"; mdl[2].au=26; mdl[2].ag=18; mdl[2].cu=26;
		mdl[3] = new Medals();
		mdl[3].nation = "ロシア"; mdl[3].au=19; mdl[3].ag=17; mdl[3].cu=20;
		mdl[4] = new Medals();
		mdl[4].nation = "ドイツ"; mdl[4].au=17	; mdl[4].ag=10; mdl[4].cu=15;
		mdl[5] = new Medals();
		mdl[5].nation = "日本"; mdl[5].au=	12; mdl[5].ag=8; mdl[5].cu=21;
//		System.out.println(mdl[4].nation);
		// これらの国の中で銅メダルが一番少ない国を表示してください。
		int min = mdl[0].cu;
		String name = mdl[0].nation;
		
		for ( int i = 1 ; i < 6 ; i++ )
		{
			if ( min > mdl[i].cu)
			{
				min = mdl[i].cu;
				name = mdl[i].nation;
			}
		}
		System.out.println("銅メダルの少ない国は" + name + "数は" + min);
	}

}