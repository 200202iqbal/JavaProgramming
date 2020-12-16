package w3school;

public class MyClass {
static void myMethod(String fname, int age) {
	System.out.println(fname + "is " + age );
}

static int myMethodReturn (int x) {
return 15 + x ;
	 
}

public static void main ( String[] args) {
	myMethod("iqbal", 25);
	myMethod("tawakal",14);
	myMethod("bale", 30);
	
	System.out.println(myMethodReturn(15));
}
}
