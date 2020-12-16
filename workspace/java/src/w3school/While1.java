package w3school;

public class While1 {

	public static void main(String[] args) {
		boolean doorClose;
		doorClose = true;
		int i = 0;
		int n = i+1;
		while (doorClose == true ) {
			
			System.out.println( n + "ノックする");
			System.out.println( n + "一分まつ");
			i++;
			n = i +1;
			if ( i >4 )
			{
				doorClose = false;
			}
		}
		System.out.println("終わり");
	}

}
