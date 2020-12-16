package ex03;

interface InterfaceEvents1
{
	void custom();
	void place();
}

interface InterfaceSchedule1
{
	void schedule();
}

abstract class AbstractCar2
{
	abstract void price();
}

class Prius2 extends AbstractCar2 implements InterfaceEvents1,InterfaceSchedule1
{

	void price()
	{
		System.out.println("価格は250万円です。");
	}
	public void custom() {
		System.out.println("プリウスをイベント用にカスタマイズします。");
	}

	public void place()
	{
		System.out.println("プリウスはAブロックに展示されます。");
	}

	public void schedule()
	{
		System.out.println("一週間展示します。");
	}
}

class Skyline3 extends AbstractCar2 implements InterfaceEvents1,InterfaceSchedule1
{

	void price()
	{
		System.out.println("価格は300万円です。");
	}

	public void custom()
	{
		System.out.println("スカイラインをイベント用にカスタマイズします。");

	}
	public void place()
	{
		System.out.println("スカイラインはAブロックに展示されます。");
	}

	public void schedule()
	{
		System.out.println("5日間てんじします。");
	}
}
public class InterfaceTest1 {

	public static void main (String[] args )
	{
		Prius2 prius = new Prius2();
		prius.custom();
		prius.place();
		prius.price();
		prius.schedule();

		System.out.println();
		System.out.println();

		Skyline3 skyline = new Skyline3();
		skyline.custom();
		skyline.place();
		skyline.schedule();
		skyline.price();
	}
}
