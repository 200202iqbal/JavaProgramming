package ex1;

public class BranchRep5 {

	public static void main(String[] args) {

		//if else
		int age  = 10 ;
		if (age >= 20 )
		{
			System.out.println("You can drink alcohol");
		}else
		{
			System.out.println("You can't");
		}

		//if
		if ( age > 70 )
		{
			System.out.println("You get an Elder Path");
		}

		//if else if else

	if ( age < 6 )
	{
		System.out.println("学校なし");
	}
	else if (age < 12 )
	{
		System.out.println("小学校");
	}
	else if (age < 15 )
	{
		System.out.println("中学校");
	}
	else if (age < 18 )
	{
		System.out.println("高学校");
	}
	else 
	{
		System.out.println("もう大人です");
	}
	}
}
