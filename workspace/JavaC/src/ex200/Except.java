package ex200;

public class Except {
	public void func()
	{
		try
		{
			System.out.println();
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
