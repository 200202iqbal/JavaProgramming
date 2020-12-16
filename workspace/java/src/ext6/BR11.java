package ext6;
import java.util.Random;

public class BR11 {

	public static void main(String[] args) {
		
	//	Scanner scn = new Scanner (System.in);
	//	System.out.print("時間 : ");
		
		//int time = scn.nextInt();
		System.out.println();
		
		while ( true ) {
		
			int time = new Random().nextInt(24)+1;
			
		if ( time >= 0  && time < 12)		
		{
			System.out.println( time +  " AM ");
		}else 
		{
			System.out.println(time + " PM ");
		}}

	}

}
