package api8;

import java.util.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		String[] name = {"홍길동","이기자","김말숙","최고봉","소나무","고인돌"};
		int cnt = 0;
		
		System.out.println("name의 자료들");
		for(String na : name) {
			System.out.println("name["+cnt+"] : " + na);
			cnt++;
		}
		System.out.println();
		
		System.out.println("복사된 name2의 자료들");
		String[] name2 = Arrays.copyOfRange(name, 0, name.length);
		cnt = 0;
		for(String na : name2) {
			System.out.println("name2["+cnt+"] : " + na);
			cnt++;
		}
		System.out.println();
		
		System.out.println("부분복사된 name3의 자료들");
		String[] name3 = Arrays.copyOfRange(name, 1, 3);
		cnt = 0;
		for(String na : name3) {
			System.out.println("name3["+cnt+"] : " + na);
			cnt++;
		}
		System.out.println();
		
		// Arrays.copyOf(배열명, 마지막인덱스위치-1)
		System.out.println("부분복사된 name3의 자료들");
		String[] name4 = Arrays.copyOf(name, 3);
		cnt = 0;
		for(String na : name4) {
			System.out.println("name4["+cnt+"] : " + na);
			cnt++;
		}
		
	}
}
