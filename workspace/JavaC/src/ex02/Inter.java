package ex02;

abstract class Shape2
{
	int size;
	abstract public void draw();
}
interface ClosedShape
{
	//double getArea();
	default double getArea()
	{
		return 10.0;
	}
}

interface ClosedShape2
{
	void printArea();
}

class Cir extends Shape2 implements ClosedShape, ClosedShape2
{
	/*public double getArea ()
	{
		return 2.0;
	}*/

	public void  printArea ()
	{
		System.out.println( "円の描画");
	}

	public void draw()
	{
		System.out.println("描画する");
	}
}
public class Inter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cir c = new Cir() ;
		System.out.print("c draw() は");
		c.printArea();
		System.out.println("c getArea() は " + c.getArea());
		c.draw();
	}

}
