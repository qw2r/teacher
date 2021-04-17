package t7_exam2;

import java.util.ArrayList;
import java.util.Scanner;

public class OlympicRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<OlympicVo> vos = new ArrayList<OlympicVo>();
		OlympicService oService = new OlympicService();
		OlympicVo vo = null;
		
		while(true) {
			System.out.print("성명?(종료:999) ");
			String name = sc.next();
			if(name.equals("999")) break;
			
			vo = new OlympicVo();
			vo.setName(name);
			System.out.print("종목? ");
			vo.setJongMok(sc.next());
			
			int[] score = new int[5];
			for(int i=0; i<5; i++) {
				System.out.print((i+1)+". 점수? ");
				score[i] = sc.nextInt();
			}
			vo.setScore(score);
			oService.avgProcess(vo);  // 최고와 최저점수를 뺀 총점수의 평균구하기
			
			vos.add(vo);  	// 한건의 자료 처리가 끝나고 vos에 담기
			
			System.out.println("-----------------------------------");
		}
		System.out.println();
		
		oService.resultProcess(vos);  	// 입력처리가 끝나면 순위및 최종 출력작업을 호출한다.
		System.out.println("작업끝... 수고하셨습니다.");
		
		sc.close();
	}
}
