package ex1;
import java.util.Random;
public class BranchRep6 {

	public static void main(String[] args) {
		//switch文
		
		int lot = new Random().nextInt(4);
		switch ( lot )
		{
		case 0 :
			System.out.println("大吉desu");
		break;
		case 1 :
			System.out.println("中吉desu");
			break;
		case 2 :
			System.out.println("小吉desu");
			break;
			
			default :
				System.out.println("区");
				break;
			
		}

	}

}
