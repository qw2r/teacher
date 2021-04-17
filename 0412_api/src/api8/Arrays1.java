package api8;

import java.util.Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		//int[] arr = new int[100];
		int[] arr = {22,15,35,57,19,42};
		
		int cnt = 0;
		System.out.println("arr배열의 원본");
		for(int a : arr) {
			System.out.println("arr["+cnt+"] = " + a);
			cnt++;
		}
		System.out.println();
		
		Arrays.sort(arr); // arr배열의 값들을 오름차순 정렬시켜준다.
		cnt = 0;
		System.out.println("arr배열의 정렬된 자료");
		for(int a : arr) {
			System.out.println("arr["+cnt+"] = " + a);
			cnt++;
		}
		
	}
}
