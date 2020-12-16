package ex9;


public class Capcel2 {

	public static void main(String[] args) {

		Access2 ac = new Access2();

		System.out.println(ac.getPri());
		ac.setPri(50);
		System.out.println(ac.getPri());
		ac.setName("iqbal");
		ac.printAccess();

	}

}
