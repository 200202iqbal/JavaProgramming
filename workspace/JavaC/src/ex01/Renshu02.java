package ex01;

class Juice
{
	int size;
	String made;
	String bottle;
	Juice ()
	{

	}
	Juice ( int size, String made, String bottle)
	{
		this.size = size; this.made = made ; this.bottle = bottle;
	}
}

class Cola extends Juice
{
	String co2;
	Cola()
	{

	}
	Cola(int size, String made, String bottle)
	{
		super(size,made,bottle);

	}
}

class Coffe extends Juice
{
	boolean milk;
	Coffe(boolean milk)
	{
		this.milk = milk;
	}
	Coffe( int size, String made, String bottle, boolean milk)
	{
		super(size,made,bottle);
		this.milk = milk;
	}
}
public class Renshu02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*Coffe coffe1 = new Coffe(250,"beans","can",true);
		Coffe coffe2 = new Coffe(250,"beans", "can", false);
		Cola cola1 = new Cola (500,"black","pet");
		Cola cola2 = new Cola (500,"black","pet");
		System.out.println(coffe2.milk);*/

		//polymorphism

		Juice[] c = new Juice[4];
		c[0] = new Coffe ( 250, "beans" , "can", true);
		c[1] = new Coffe ( 250, "beans" , "can", false);
		c[2] = new Cola ( 500, "black" , "pet");
		c[3] = new Cola ( 500, "black" , "pet");

		for (int i = 0; i < c.length; i++)
		{
			System.out.println(c[i].size);
			nameGet(c[i]);

		}

	}

	public static void nameGet(Juice x)
	{
		if ( x.made.equals("black"))
		{
			System.out.println("Cola");
		}else if ( x.made.equals("beans"))
		{
			System.out.println("Coffe");
			if ( ((Coffe)x).milk == true )
			{
				System.out.println("ミルクいり");
			}
			else
			{
				System.out.println("ミルクなし");
			}
		}
			
	}
}
