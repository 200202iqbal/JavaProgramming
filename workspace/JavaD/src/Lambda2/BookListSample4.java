package Lambda2;
import java.util.function.Function;

public class BookListSample4 {
	public static void main(String[] args)
	{
		/*ラムダ式
		Function <String,String> obj = s -> "Hello" + s;
		System.out.println(obj.apply("tanaka"));
		*/
		
		//匿名クラス
		String str = new Function<String,String>()
				{
			public String apply(String str)
			{
				return "Hello" + str;
			}
				}.apply(" tanaka");
				System.out.println(str);
	}

}
