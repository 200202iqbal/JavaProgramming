package ex200;

public class Ex301 {
	
	public static void main (String[] args)
	{
		Except1 ex1 = new Except1();
		Except2 ex2 = new Except2();
		try
		{
			ex1.func1();
		}
		catch(Exception e)
		{
			System.out.println("A");
		}
		finally
		{
			ex2.func2();
			System.out.println("B");
		}
		System.out.println("C");
	}

}
class Except1
{
	int[] array = new int[5];
	public void func1()
	{
		try
		{
			for (int i = 0; i < 10 ; i++)
			{
				array[i] = i;
			}
		}catch (Exception e ) 
			{
				System.out.println("D");
			}
			finally
			{
				System.out.println("E");
			}
	
	}
}
class Except2
{
	public void func2()
	{
		try
		{
			System.out.println("F");
		}
		catch (Exception e)
		{
			System.out.println("G");
		}finally
		{
			System.out.println("H");
		}
	}
}