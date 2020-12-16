package term2Review;

import java.util.Random;

public class Kadai1 {
	public static void main(String[] args) {
		// Random.nextIntを使って整数rndに0，1，2の値をセットします
		//　0だったら『晴れ』、１だったら『曇り』、2だったら『雨』と表示してください。
		// Randomとif- else if- elseの確認
		int rnd = new Random().nextInt(3);
		if(rnd == 0 ) {
			System.out.println("晴れ");
		} else if(rnd == 1) {
			System.out.println("曇り");
		} else {
			System.out.println("雨");
		}
	}
}
