package ex404;
import java.util.HashMap;
public class GFG {
	public static void main (String[] args)
	{
		// Create an empty hash map
		HashMap <String, Integer> map = new HashMap<>();
		//Add element to the map
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav",20);

		//Print size andd content
		System.out.println("Size of map is : " + map.size());
		System.out.println(map);

		//Check if a key is present and if present, print value
		if (map.containsKey("vishal"))
		{
			Integer a = map.get("vishal");
			System.out.println("value for key vishal : " + a );
		}
		float sum = 0;
		for ( int i = 1 ; i<=9 ; i++)
		{
			sum += 0.1;
			System.out.println(sum);
			
		}
		
		System.out.println( sum== 1);
	}

}
