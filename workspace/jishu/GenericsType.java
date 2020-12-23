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

public class GenericsType 
{
    public static void main (String[] args)
    {
        Foo<String> foo = new Foo<>("Hello");
        Foo<Integer> foo2 = new Foo<>(123);
        String msg = foo.getObj();
        System.out.println(msg);
        
        int a = foo2.getObj();
        System.out.println(a);
    }
}