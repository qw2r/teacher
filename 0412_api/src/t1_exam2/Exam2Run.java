package t1_exam2;

import java.util.Scanner;

public class Exam2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Exam2Vo vo = new Exam2Vo();
		
		while(true) {
			System.out.print("사칙연산 계산기 입니다. 계속하시겠습니까?(Y/N) ");
			String flag = sc.next();
			if(flag.equals("N") || flag.equals("n")) break;
			
			System.out.print("첫번째 수를 입력? ");
			String su1 = sc.next();
			System.out.print("두번째 수를 입력? ");
			String su2 = sc.next();
			System.out.print("연산자 입력(+,-,*,/)? ");
			String operator = sc.next();
			// operator '+,-,*,/' 체크루틴
			
			try {
				vo.setSu1(Integer.parseInt(su1));
				vo.setSu2(Integer.parseInt(su2));
				vo.setOperator(operator);
				
				Exam2Service ex2s = new Exam2Service();
				
				switch(operator) {
					case "+":
						ex2s.add(vo);
						break;
					case "-":
						ex2s.subtract(vo);
						break;
					case "*":
						ex2s.multiply(vo);
						break;
					case "/":
						ex2s.divide(vo);
						break;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하셔야 합니다.");
			}
		}
		System.out.println("작업끝....");
		sc.close();
	}
}
