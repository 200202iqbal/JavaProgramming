package ex02;

abstract class Shape
{
	int size ;
	abstract public void draw ();
	/*{
		System.out.println("描画します");
	}*/
}

class Circle extends Shape
{
	public void draw() //子クラスで具体メソッドを書く
	{
		System.out.println("円を描画します");
	}
}

class Rect extends Shape
{
	public void draw()
	{
		System.out.println("四角を描画します");
	}
}
public class Abs01 {
	public static void main ( String[] args)
	{
		//Shape shap = new Shape();
		Circle en = new Circle();
		Rect shikaku = new Rect();
		//shap.draw();
		en.draw();
		shikaku.draw();
	}
}
