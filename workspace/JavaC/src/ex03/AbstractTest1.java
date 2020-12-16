package ex03;

abstract class AbstractCar1
{
	abstract void run();
	abstract void stop();
}

class Prius1 extends AbstractCar1
{
	void run()
	{
		System.out.println("プリウスが走ります");
	}
	@Override
	void stop
	()
	{
		System.out.println("プリウスが止まります.");
	}
}

class Skyline1 extends AbstractCar1
{
	int maxSpeed;

	Skyline1 ( int speed )
	{
		maxSpeed = speed ;
	}
	Skyline1()
	{

	}

	void getmaxSpeed()
	{
		System.out.println("最高速度は " + this.maxSpeed + " km");
	}

	void Drift()
	{
		System.out.println("スカイラインがDRift");
	}

	@Override
	void run()
	{
		System.out.println("スカイラインが走ります");
	}
	void stop()
	{
		System.out.println("スカイラインが止まります");
	}

}

public class AbstractTest1 {
	public static void main ( String[] args )
	{
		Prius1 prius = new Prius1();
		prius.run();
		prius.stop();

		Skyline1 skyline = new Skyline1(150);
		Skyline1 skyline2 = new Skyline1();
		skyline.run();
		skyline.stop();
		skyline.getmaxSpeed();

		System.out.println("Skyline2");
		skyline2.run();
		skyline2.stop();
		skyline2.Drift();

	}
}
