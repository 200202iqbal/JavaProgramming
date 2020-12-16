package ex100;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Pr00 {

	public static void main (String[] args)
	{
		// List 問題
				//Integer 型のArrayList list00 を宣言してください。
			List<Integer> list00  = new ArrayList<Integer>();
 				//要素30,10,20を登録し、listの内容を表示してください。
			list00.add(30);
			list00.add(10);
			list00.add(20);

			for (int i : list00 )
			{
				System.out.println(i);
			}
				//list00に要素50と40を順に追加してください
			list00.add(50);
			list00.add(40);
				//list00の要素番号３の要素を表示してください
			System.out.println("List00[3] : " + list00.get(3));
				//list00の要素番号２の要素を60に変更してください
			list00.set(2, 60);
				//list00の要素番号３を削除してください
			list00.remove(3);
				// list00の要素数を表示してください
			int sum = 0;
			for ( int i : list00)
			{
				 sum = sum + i;
			}
			System.out.println("List00の要素数 : " + sum);
				//list00を表示してください
			System.out.println(list00);
				//list00 の要素を小さい順にならべ替えをして、list00を表示してください。
			list00.sort(Comparator.naturalOrder());
			System.out.println("List00.naturalOrder : " +list00);
				//今度は大きい順に並べ替えをして、list00を表示してください
			list00.sort(Comparator.reverseOrder());
			System.out.println("List00.reverseOrder : " + list00);
				//String 型のArrayList list01を宣言してください
			List <String> list01 = new ArrayList<String>();
				//要素”Tokyo”, "Osaka", "Nagoya"を登録し、list01の内容を表示してください。
			list01.add("Tokyo");
			list01.add("Osaka");
			list01.add("Nagoya");
				//list01に"Kyoto"と"Yokohana"を追加してlist01を表示してください。
			list01.add("Kyoto");
			list01.add("Yokohama");
			System.out.println(list01);
			for ( String s : list01)
			{
				System.out.println(s);
			}
				//list01から”Nagoya”を削除してください
			for (int i = 0 ; i < list01.size() ; i++)
			{
				if ( list01.get(i).equals("Nagoya"))
				{
					list01.remove(i);
				}
			}
			//list01.remove(lis01.indexOf("Nagoya");

			System.out.println("List01 : " + list01);

				// list01の要素の数を表示してください。
			System.out.println("List01 total element : " +list01.size());

				//Map問題
				//Integer型のkeyとString型のValueを持つmap00を宣言してください
			Map <Integer,String> map00 = new HashMap <Integer,String>();
				//map00 に次の要素を追加してください　key = 100 , Value = "AAA"
			map00.put(100, "AAA");
				//map00 に次の要素を追加してください　key = 200 , Value = "BBB"
			map00.put(200, "BBB");
				//map00 に次の要素を追加してください　key = 300 , Value = "CCC"
			map00.put(300, "CCC");
				//map00 のkeyが200の要素のvalueを表示してください
			System.out.println("map00.get(200) : " + map00.get(200));
				//map00 からkeyが200の要素を削除してください
			map00.remove(200);
				// map00の要素の数を表示してください
			System.out.println("map00の要素の数は : " + map00.size());
				//map00 に次の要素を追加してください key = 300, Value = "DDD"
			map00.put(300, "DDD");
				//map00 に次の要素を追加してください key = 200, Value = "EEE"
			map00.put(200, "EEE");
				//map00 のすべての要素を表示してください、
			System.out.println(map00);
				// map00 のkey = 300の要素があればTrue,なければFalseと表示してください
			boolean isMap300True = map00.containsKey(300);
			if (isMap300True)
			{
				System.out.println("Check map00.get(300) : " + isMap300True);
			}
			else
			{
				System.out.println("Check map00.get(300) : " + isMap300True);
			}
				// map00にValueが”DDD"である要素のkeyを表示してください
			for(int key: map00.keySet())
			{
			    if(map00.get(key).equals("DDD")) {
			        System.out.println("map00 key by value DDD : "+key);

			    }
			}

			/*for ( Map.Entry<Integer, String> elm : map00.entrySet())
			{
				if (elm.getValue().equals("DDD"))
				{
					System.out.println(elm.getKey());
				}
			}*/
			//String型のkeyとString型のValueをもつmap01を定義してください
			Map < String , String > map01 = new HashMap<String,String>();
				// map01に次の要素を追加してください　key = "a”　Value = "あ"
			map01.put("a", "あ");
				//　続けて、key = "i" value = "い”、 key = "u" value = "う”を登録してください
			map01.put("i", "い");
			map01.put("u", "う");
				//　map01のkey = aの要素のvlaueを表示してください
			System.out.println("Value map01(a) " + map01.get("a"));
				//  map01の内容を表示してください。
			System.out.println(map01);

				//Set問題
				//Integer型の要素を持つHashSet  set00を定義してください。
			Set < Integer > set00 = new HashSet<Integer>();
				//set00 に200,100、300の要素を登録してください。
			set00.add(200);
			set00.add(100);
			set00.add(300);
			    	//set00 を表示してください
			for ( int n : set00)
			{
				System.out.println(n);
			}
			System.out.println(set00);
				//set00に要素200を追加してください
			set00.add(200);
				//set00の要素の数を表示してください
			System.out.println("set00 size() : " + set00.size());
				// set00から要素100を削除してください
			set00.remove(100);
				//set00の要素を表示してください
			for ( int n : set00)
			{
				System.out.println( "set00の要素 : "+ n);
			}
			  	 // String型の要素を持つ、list02を作成してください
			List < String > list02 = new ArrayList<String>();
				//list02に要素を以下の順に登録してください"bb", "cc", "aa", "dd", "ee"
			list02.add("bb");
			list02.add("cc");
			list02.add("aa");
			list02.add("dd");
			list02.add("ee");
				// list02 のすべての要素を表示してください
			System.out.println(list02);
				// list02の要素を辞書順(小さい順）に並び替えてください
			Collections.sort(list02);

				// list02のすべての要素を表示してください。
			System.out.println(list02);
				//list02を大きい順（逆辞書順）に並び替えてください。
			list02.sort(Comparator.reverseOrder());
				// list02の要素番号１を表示してください。
			System.out.println("list02の要素番号１ : " + list02.get(1));
				// フィールド変数にString型valueをもつclass XXXを最後のところに定義してあります。。
				//   コメントを外して使用できるようにしてください

				// class XXXを要素にもつ、ArrayList   list03を定義してください。
			List <XXX> list03 = new ArrayList<XXX>();
				// list03にXXX型の要素（インスタンス　valueの値は"bb"）を追加してください
			list03.add(new XXX("bb"));
				// list03にXXX型の要素（インスタンス　valueの値は"cc"）を追加してください
			list03.add(new XXX("cc"));
				// list03にXXX型の要素（インスタンス　valueの値は"aa"）を追加してください
			list03.add(new XXX("aa"));
				//list03の要素のvalueの値を、すべて表示してください。
			System.out.println("Value of List03 : ");
			for (int i = 0 ; i < list03.size() ; i++ )
			{
				System.out.println("indeks :" + i);
				list03.get(i).printValue();
			}
			for (XXX x : list03)
			{

				x.printValue();
			}
				//list03の要素は、list03.sort(Comparator.naturalOrder());でソートできないことを確認
				//　その後、この行はコメンアウトしてください

				//class XXXsort を一番最後のところに定義してあります。
				//	コンパレータです。コメントを外して使用できるようにしてください

				//class XXXsortのインスタンスをXXXcpという名前でインスタンスを作成してください。
				XXXsort XXXcp = new XXXsort();

				//cpを使ってlist03を辞書順（小さい順）にソートしてください
				list03.sort(XXXcp);;
				System.out.println();
				//list03の要素のvalueの値を、すべて表示してください。
				for (int i = 0 ; i < list03.size() ; i++)
				{
					list03.get(i).printValue();
				}
				//list03の要素を大きい順にソートしてひょうじしてください。
				list03.sort(XXXcp.reversed());
				System.out.println();
				for ( int i = 0; i < list03.size() ; i++ )

				{
				 list03.get(i).printValue();
				}
				System.out.println();
				System.out.println(list03.toString());
			}
		}
		class XXX {
			String value;
			int num = 5;
			public XXX(String value)
			{
				this.value = value;
			}
			public void printValue()
			{
				System.out.println(value);
			}
			public String toString()
			{
				return this.value;
			}
			
		}

		class XXXsort implements Comparator<XXX> {
			@Override
			public int compare(XXX o1, XXX o2) {
				return o1.value.compareTo(o2.value);
			}
		}
