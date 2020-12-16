//lambda
package Lambda;

public class ContohLambdaJava8
{
  public static void main(String[] args)
  {
    ContohLambdaJava8 obj = new ContohLambdaJava8();

    //dengan type declaration
    OperasiPerhitungan penjumlahan = (int a, int b) -> a+b;

    //tanpa type declaration
    OperasiPerhitungan pengurangan = (a, b) -> a - b;

    //dengan return statement dan dengan kurang kurawal
    OperasiPerhitungan perkalian = (int a ,int b) -> {return a * b;};

    //tanpa return statement and tanpa kurang kurawal
    OperasiPerhitungan pembagian = (int a, int b) -> a / b;

    System.out.println("10 + 5 = " + obj.operate(10,5,penjumlahan));
    System.out.println("10 - 5 = " + obj.operate(10,5,pengurangan));
    System.out.println("10 * 5 = " + obj.operate(10,5,perkalian));
    System.out.println("10 / 5 = " + obj.operate(10,5,pembagian));

  }

  private interface OperasiPerhitungan
  {
    int operation(int a, int b);
  }
  private int operate(int a, int b, OperasiPerhitungan op)
  {
    return op.operation(a,b);
  }
}
