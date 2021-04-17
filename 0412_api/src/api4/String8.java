package api4;

public class String8 {
	public static void main(String[] args) {
		int su = 1234;
		System.out.println("안녕하세요!" + su);
		
		// valueOf() : 문자열로 변환
		String su1 = "1234";
		String su2 = String.valueOf(1234);
		String su3 = String.valueOf(12.34);
		String su4 = String.valueOf(true);
		
		System.out.println("1234 : " + su2);
		System.out.println("12.34 : " + su3);
		System.out.println("true : " + su4);
	}
}
