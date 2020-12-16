package Lambda;

interface Bar<T,R>
{
	R get(T obj);
}

class Gen
{
	public <T> void display(T obj)
	{
		System.out.println(obj);
	}
}
public class GenericsType2 {

	public static void main (String[] args)
	{
		Gen gen = new Gen();
		gen.display("aaa");
		gen.display(123);
	}
}
