package ex01;
class Vehicle
{
	int speed = 0;
	Vehicle ()
	{

	}
	Vehicle (int speed)
	{
		this.speed = speed;
	}
}

class Ships extends Vehicle
{
	int screw = 1 ; //コンストラクタなし > super()の呼び出す
}

class Airplanes extends Vehicle
{
	int engine = 2;
	Airplanes ()
	{
		super();
		super.speed = 800;
	}
}

class Car extends Vehicle
{
	int wheel = 4;
	Car () //Carのコンストラクタ
	{
		super ( 100 );
	}
}
public class Reidai03 {

	public static void main(String[] args)
	{
		Ships ship = new Ships();
		Airplanes airplane = new Airplanes();
		Car car = new Car();

		System.out.println("Car speed = " + car.speed + " " + "Car wheel = " + car.wheel);
		System.out.println("Airplane speed = " + airplane.speed + " " + "Airplane Engine = " + airplane.engine );
		System.out.println("Ship speed = " + ship.speed + " " + "Ship Crew = " + ship.screw);

	}

}
