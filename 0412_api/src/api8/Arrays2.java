package api8;

import java.util.Arrays;

public class Arrays2 {
	public static void main(String[] args) {
		int[] su = new int[10];
		
		Arrays.fill(su, 1);  // 배열에 특정값을 반복시켜 채우기
		
		for(int s : su) {
			System.out.print(s + " / ");
		}
	}
}
