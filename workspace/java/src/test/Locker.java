package test;

public class Locker {

	String content;
	String password;
	boolean locked = false;

	Locker ( String content , String password )
	{
		this.content = content;
		this.password = password;
	}

	void open(String inPass)
	{
		if ( locked == true )
		{
			if ( inPass == password )
			{
				System.out.println("✔");
			}
			else
			{
				System.out.println("✖");
			}
		}
		else
		{
			System.out.println("ロッカーは空いています");

		}

	}
	public static void main ( String[] args)
	{
		Locker a = new Locker ( "メモ" , "123");



	}
}
