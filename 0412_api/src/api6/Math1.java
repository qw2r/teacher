package api6;

public class Math1 {
	public static void main(String[] args) {
		int su1 = 100;
		int su2 = -100;
		
		// abs() : 절대값
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println("Math.abs(su2) : " + Math.abs(su2));
		System.out.println();
		
		double d1 = 1234.56;
		double d2 = -1234.56;
		
		// round() : 반올림
		System.out.println("d1 : " + d1 + " , d2 : " + d2);
		System.out.println("Math.round(d1) : " + Math.round(d1) + " , Math.round(d2) : " + Math.round(d2));
		// d1의 값과 d2의 값을 소수이하 첫째자리까지 구하시오
		System.out.println("소수첫째자리까지 반올림 : " + (Math.round(d1*10))/10.0);
		System.out.println();
		
		// ceil() : 올림
		System.out.println("무조건 올림 : d1 = " + Math.ceil(d1) + " , d2 =" + Math.ceil(d2));
		
		// floor() : 내림
		System.out.println("무조건 올림 : d1 = " + Math.floor(d1) + " , d2 =" + Math.floor(d2));
		
		// max() : 최대값
		System.out.println("d1과 d2중 최대값은? " + Math.max(d1, d2));
		
		// min() : 최소값
		System.out.println("d1과 d2중 최대값은? " + Math.min(d1, d2));
		
		// random() : 난수(0 <= res < 1) 실수형 값을 꺼내준다.
		double rand = Math.random();
		System.out.println("rand : " + rand);
	}
}
