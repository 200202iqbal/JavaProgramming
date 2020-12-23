//Lambda式を使う書き方
interface TestInterface
{
    public String method(String name, Integer num);
}

//percobaan mengaplikasikan lambda
interface TestInterface2 
{
    public int size(int width, int height);
}

public class LambdaSample22
{
    public static void main (String[] args)
    {
        TestInterface tif = (name,num) -> {
            return "Hello " + name + num + " !";
        };

        TestInterface2 persegi = (int width,int height) ->{
            return width * height;
        };
        System.out.println(tif.method("Java ",8));
        System.out.println(persegi.size(5,5));
    }
}