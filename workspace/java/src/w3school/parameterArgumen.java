package w3school;
import java.util.Scanner;
public class parameterArgumen {

	static void brandNotebook (String brand, int year)
	{
		System.out.println(brand + year);
	}

	static double luasPersegiPanjang ( double panjang , double lebar)
	{
		return panjang*lebar;

	}
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		brandNotebook("HP", 2020);
		brandNotebook("Asus", 2019);
		System.out.println();
		System.out.println();

		System.out.print("Panjang : ");
		double panjang = scn.nextDouble();
		System.out.print("Lebar : ");
		double lebar = scn.nextDouble();


		double a = luasPersegiPanjang(panjang,lebar);
		System.out.println(a);
		


	}

}
