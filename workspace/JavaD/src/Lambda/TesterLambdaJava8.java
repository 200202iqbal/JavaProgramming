package Lambda;

public class TesterLambdaJava8
{
  private interface GreetingService
  {
    public void sayMessage (String pesan);
  }
  public static void main(String[] args)
  {

    String msg = "Hello!";
    GreetingService greetService1 = pesan ->
    System.out.println(msg + pesan);
    greetService1.sayMessage("Kitty");
  }
}
