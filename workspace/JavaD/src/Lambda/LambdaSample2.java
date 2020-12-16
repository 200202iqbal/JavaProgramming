package Lambda;

interface TestInterFace
{
	public String method(String name,int num);
}

public class LambdaSample2 implements TestInterFace{
	public static void main(String[]args)
	{
		LambdaSample2 lms2 = new LambdaSample2();
		System.out.println(lms2.method("Java", 8));
	}

	//TestInterFaceの抽象メソッドを実装
	@Override
	public String method(String name, int num)
	{
		return "Hello " + name + " " + num + " !";
	}
}
