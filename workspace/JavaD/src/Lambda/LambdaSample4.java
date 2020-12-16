package Lambda;

interface TestInterFace1
{
	public String method (String name,int num);//抽象メソッド)
	
	//public int method2(int a, int b);//一個しかない
}

interface TestInterFace2
{
	public int method(int a, int b);
}
public class LambdaSample4 {
	public static void main(String[] args)
	{
		TestInterFace1 tif1 = (name,num) ->
		{
			return "Hello " + name + num + " !";
		};
		System.out.println(tif1.method("Java", 12));
		
		TestInterFace2 tif2 = (a,b) -> {
			return a+b;
			};
			System.out.println(tif2.method(15,100));
	}
	
	

}
