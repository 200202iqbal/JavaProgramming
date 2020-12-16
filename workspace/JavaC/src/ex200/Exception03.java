package ex200;

public class Exception03 {
	/*public static void method() throws Exception
	{
		String str = null;
		System.out.println(str.length());
	}*/

	public static void main (String[] args)
	{
		try
		{
		//	method();
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("[Exception]の例外をキャッチしました");
		}
	}

}
