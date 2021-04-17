package api4;

public class String5 {
	public static void main(String[] args) {
		String str1 = "Hello!";
		
		// getChars() : 문자열을 각각의 문자(char)배열로 복사한다.
		char[] strArr = new char[str1.length()]; 
		str1.getChars(0, str1.length(), strArr, 0);
		System.out.println("strArr[] : " + strArr);
		
		for(char str : strArr) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		// contains : 문자열 포함여부를 true/false 로 반환
		if(str1.contains("le")) {
			System.out.println("str1에는 le 문자열을 포함하고 있습니다.");
		}
		else {
			System.out.println("str1에는 le 문자열이 없습니다.");
		}
		
		// reverse() : 문자열을 반전한다.
		StringBuffer sb = new StringBuffer(str1);
		System.out.println("Hello! 문자의 반전글자 : " + sb.reverse());
	}
}
