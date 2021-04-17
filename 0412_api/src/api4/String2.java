package api4;

public class String2 {
	public static void main(String[] args) {
		// toUpperCase() : 영문 대문자로 변환
		// toLowerCase() : 영문 소문자로 변환
		//            0         1
		//            012345678901234567
		String msg = "Welcome to Korea!!";
		String msg2 = "Welcome to 한국!!";
		
		System.out.println("원본글자 : " + msg);
		System.out.println("대문자로 출력된 결과 : " + msg.toUpperCase());
		System.out.println("소문자로 출력된 결과 : " + msg.toLowerCase());
		System.out.println();
		
		// length() : 문자열의 길이를 구한다.
		System.out.println("msg의 길이? " + msg.length());
		System.out.println("msg2의 길이? " + msg2.length());
		
		// subSting(a) , subString(a,b) : 지정된 문자(열)을 추출한다.
		System.out.println("Korea를 추출해보자? " + msg.substring(11, 16));
		System.out.println("Korea를 추출해보자? " + msg.substring(11));
		
		// replace(a,b) : a문자열을 b문자열로 치환
		System.out.println("Korea를 USA로 치환 : " + msg.replace("Korea", "USA"));
		System.out.println("Korea를 USA로 치환 : " + msg.replace("Korea", "abcd"));
		
		// indexOf(a) : 특정 문자(a)가 있는지를 확인해서 있으면 그 위치값을 출력, 없으면 -1을 출력
		System.out.println("K문자의 존재 유무? " + msg.indexOf("K"));
		System.out.println("k문자의 존재 유무? " + msg.indexOf("k"));
	}
}
