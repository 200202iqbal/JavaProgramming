package ex9;

public class Access {
	public int pub = 10;
	int pkpri = 20;
	private int pri = 30;
	public void printAccess ()
	{
		System.out.println("public = " + pub + " " );
		System.out.println("package private  = " + pkpri + " ");
		System.out.println("private = " + pri );
	}
}