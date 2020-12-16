package ex200;

public class ExceptionTest1 {
	
	public static void main (String[] args)
	{
		int a = 4;
		int b = 0;
		try {
		

		System.out.println(a + " / " + b + " = " + a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticExceptionをキャッチしました");
			b = 1;
			System.out.println(a + " / " + b + " = " + a/b);
		}
		
		catch(Exception e)
		{
			System.out.println("例外をキャッチしました");
		}
		
	}

}
