package ex100;
import java.util.HashSet;
import java.util.Set;
public class CollectionTest4 {

	public static void main(String[] args) {
	
			String[] values = {"あ","い","う","え","お","い","か","き","あ",};
			Set <String> set4 = new HashSet<String>(); 
		
			/**Arrays.sort(values);
			for (String s : values)
			{
				System.out.println(s);
			}
			set4.addAll(Arrays.asList(values));
			**/
			for ( int i = 0; i < values.length; i++)
			{
				set4.add(values[i]);
			}
			for (String s : set4)
			{
				System.out.println(s);
			}

}}
