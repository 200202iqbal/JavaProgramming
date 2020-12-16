package ex100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysClsMethod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] arr = {"apple" , "grape" , "orange"};
		List <String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(arr));
		System.out.println(list);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = new int[3];
		Arrays.fill(arr1, 100);
		System.out.println(Arrays.toString(arr1));
		
		arr1[0] = 200; arr1[1] = 100; arr1[2] = 300;
		System.out.println(Arrays.toString(arr1));
	}

}
