package ex100;

import java.util.HashMap;
import java.util.Map;


public class MapEntry
{
	public static void main (String[] args)
	{
		Map <String, String> fruits = new HashMap<String, String>();
		fruits.put("apple", "ringo");
		fruits.put("pear", "nashi");
		fruits.put("grape", "budou");

		for (Map.Entry<String, String> entry : fruits.entrySet())
		{
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		System.out.println(fruits);
	}
}
