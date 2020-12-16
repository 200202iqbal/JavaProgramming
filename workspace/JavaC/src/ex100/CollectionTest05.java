package ex100;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class ProductClass
{
	public Map <Integer,ArrayList<String>> collection()
	{

		Map<Integer,ArrayList<String>> map = new HashMap<Integer,ArrayList<String>>();
		ArrayList<String> list1 = new ArrayList<String>();
		for ( int i = 0; i<5; i++)
		{
			list1.add("商品A : " + (i + 1));
		}

		ArrayList<String> list2 = new ArrayList<String>();
		for (int i = 0 ; i<5 ; i++)
		{
			list2.add("商品B :" + (i + 6));
		}

		ArrayList<String> list3 = new ArrayList<String>();
		for (int i = 0; i<5 ; i++)
		{
			list3.add("商品C : " + (i+11));
		}

		map.put(1 , list1);
		map.put(2 , list2);
		map.put(3 , list3);

		return map;

	}
}
public class CollectionTest05 {

	public static void main(String[] args) {

		ProductClass product = new ProductClass();
		Map<Integer,ArrayList<String>> map = product.collection();
		for(int j = 1 ; j <= 3 ; j++) {
		for ( int i = 0 ; i < 5; i++)
		{
			System.out.println(map.get(j).get(i));
			
		}
		System.out.println();
		System.out.println(map.toString());
		}
		

	}

}
