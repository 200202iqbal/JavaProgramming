package Lambda;

public class RunnerSample {
	public static void main(String[] args)
	{
		Runnable runner =()-> {System.out.println("Hello Lambda");};
		runner.run();
		
	}
}
