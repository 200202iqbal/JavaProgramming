package ex5;
import java.util.Random;
public class Practice3 {

	public static void printCircleArea (double radius)
	{
		System.out.println("円の面積は " + radius*radius*Math.PI);
	}


	public static void printRandomMessage (String name )
	{
		int rnd = new Random().nextInt(3);

		String[] message = {"こんばんは","こんにちは","おはよう" };
		System.out.println( message[rnd] + name + "さん");
	}


	public static void printMessage (String message , int count)
	{
		for ( int i = 1 ; i <= count ; i ++ )
		{
			System.out.println(message + " " + i);
		}

	}

	public static void printRectangleArea (double height, double width )
	{
		System.out.println("長方形は "  +height * width);

	}

	public static void printMaxValue ( double a , double b , double c )
	{
		double max = Math.max(a, b);
		System.out.println("最も大きな値は " + Math.max(max, c));
	}

	public static String getMessage ()
	{
		String str = "よろしくお願いいたします。";
		return str;
	}

	public static String getMessage2 ()
	{
		//String str = "よろしくお願いいたします。";
		return "よろしくお願いいたします";
	}

	public static String getWeatherForecast ()
	{
		int rd1 = new Random().nextInt(3);
		int rd2 = new Random().nextInt(4);
		String[] day = {"今日","明日","明後日"};
		String[] wheater = {"晴れ","曇り","雨","雪"};

		String str = day[rd1] + " の天気は " + wheater[rd2] + "でしょう";

		return str;
	}

	public static String getWeatherForecast2 ()
	{
		int rd1 = new Random().nextInt(3);
		int rd2 = new Random().nextInt(4);
		String[] day = {"今日","明日","明後日"};
		String[] wheater = {"晴れ","曇り","雨","雪"};

		//String str = day[rd1] + " の天気は " + wheater[rd2] + "でしょう";

		return day[rd1] + " の天気は " + wheater[rd2] + "でしょう";
	}

	public static double getSquareRoofOf2()
	{
		double d = Math.sqrt(3.0);

		return d;
	}


	public static String getRandomMessage(String name)
	{
		int rnd = new Random().nextInt(3);
		String[] aisatsu = {"こんばんは","こんにちは","おはようございます" };

		return aisatsu[rnd] + name + "さん";
	}

	public static double getAbsoluteValue (double value )
	{
		return Math.abs(value);
	}

	public static boolean isEvenNumber ( int value )
	{
		boolean result = false;
		value = value%2;
		if ( value == 0)
		{
			result = true;
		}
		else
		{
			result =false ;
		}
		return result;
	}

	public static double getMinValue ( double a , double b )
	{
		return Math.min(a, b);
	}


	public static boolean isSameAbsoluteValue ( int a , int b )
	{
		a = Math.abs(a);
		b = Math.abs(b);
		boolean result = false ;

		if (a == b )
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printCircleArea(2.0);

		printRandomMessage ("iqbal");

		printMessage("Bale", 5);

		printRectangleArea( 5.5, 2.5);

		printMaxValue ( 100.5 , 6.9 , 5.0);

		System.out.println();
		System.out.println(getMessage());

		System.out.println();
		System.out.println(getMessage2());

		System.out.println();
		System.out.println(getWeatherForecast());

		System.out.println();
		System.out.println(getWeatherForecast2());

		System.out.println();
		System.out.println(getSquareRoofOf2());

		System.out.println();
		System.out.println(getRandomMessage("Bale"));

		System.out.println();
		System.out.println(getAbsoluteValue(5.2));
		System.out.println(getAbsoluteValue(-3.6));

		System.out.println();
		System.out.println(isEvenNumber(4));
		System.out.println(isEvenNumber(5));

		System.out.println();
		System.out.println(getMinValue(5.5 , 0.01));

		System.out.println();
		System.out.println(isSameAbsolute(5.5 , 0.01));

	}

}
