package ex4;

import java.util.Random;

public class Ex13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] suit = {"♡","♤", "♢","♧"};
		//はーと、すぺーど、くらぶ、だいや、
		String[] num = {"A","2", "3", "4", "5", "6", "7", "8",
				"9","T","J","Q", "K"};

		int srnd = new Random().nextInt(4);
		int nrnd = new Random().nextInt(13);

		System.out.println("選んだカードは " + suit[srnd] + num[nrnd]);
	}

}
