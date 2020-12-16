package ex404;

public class game04 {

	public static void main (String [] args)
	{

		for ( int i = 0 ; i <=100 ; i++)
		{

		boolean ischeckNum = i % 3 == 0;

		String s = String.valueOf(i);

		//System.out.print (s.contains("3"));

		if ( ischeckNum && i != 0 ||  s.(s.contains("3")))
			{
				System.out.println(i + " : is number ");
			}
			else
			{
				System.out.println(i + " : isn`t number ");
			}

		}

	}
}