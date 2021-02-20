import java.util.Scanner;
public class ProgramPola
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Bikin Pola");
    System.out.println("1. Persegi");
    System.out.println("2. Segitiga samakaki");
    System.out.print("Pilih pola : ");
    int jenisPola = input.nextInt();

    System.out.print("Ukuran pola : ");
    int ukuran = input.nextInt();

    switch(jenisPola)
    {
      case 1:
      polaPersegi(ukuran);
      break;
      case 2:
      polaSegitigaSamaKaki(ukuran);
      break;
      default:
      System.out.println("Pola tidak sesuai");
    }
  }

  public static void polaPersegi(int ukuran)
  {
    for(int i = 0; i < ukuran; i++)
    {
      for (int j = 0; j < ukuran; j++)
      {
        System.out.print("0");
      }
      System.out.println();
    }
  }
  public static void polaSegitigaSamaKaki(int tinggi)
  {
      for(int i = 1; i<=tinggi;i++)
      {
        for(int j = 1; j<=(tinggi * 2) - 1; j++)
        {
          if(Math.abs(tinggi-j)<i)
          {
            System.out.print("0");
          }else
          {
            System.out.print("+");
          }
        }
        System.out.println();
      }
  }
}
