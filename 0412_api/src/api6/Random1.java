package api6;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println("정수값 : " + random.nextInt());  // 약-21억 ~ +21억 사이의 난수값
		System.out.println("0~9까지 난수? " + random.nextInt(10));
		System.out.println("1~10까지 난수? " + (random.nextInt(10)+1));
		System.out.println("5~10까지 난수? " + (random.nextInt(6)+5));
		System.out.println("참/거짓 난수? " + (random.nextBoolean()));
	}
}
