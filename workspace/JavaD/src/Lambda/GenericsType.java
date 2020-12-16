package Lambda;

class Foo<T>
{
	private T obj;
	public Foo(T obj)
	{
		this.obj = obj;
	}
	public T getObj()
	{
		return obj;
	}
	public void setObj(T obj)
	{
		this.obj = obj;
	}
}
public class GenericsType {
	public static void main(String[]args)
	{
		Foo<String> foo = new Foo<>("Hello");
		String msg = foo.getObj();
		System.out.println(msg);
		
		Foo<Integer> fooInteger = new Foo<>(200202);
		Integer msgInteger = fooInteger.getObj();
		System.out.println(msgInteger);
	}

}
