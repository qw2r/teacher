package api4;

public class String6 {
	public static void main(String[] args) {
		// indexOf(), lastIndexOf() , contains(), matches()
		String str = "Hello welcome to Korea!!";
		
		System.out.println(str.indexOf("come"));
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("o", 5));
		System.out.println();
		
		// 'o'문자의 위치값을 모두 출력하시오.
		
		// lastIndexOf()
		System.out.println(str.lastIndexOf("come"));
		System.out.println(str.lastIndexOf("o"));
		
		// "그림파일.jpg" 이란 파일이있다. 해당 파일의 확장자를 출력하시오?
		
		// matches() : '정규표현식'을 이용하여 해당 문자열을 검색
		// 'come'를 포함하고 있는가?   .*~~~.* 
		//if(str.contains("come")) {
		if(str.matches(".*come.*")) {
			System.out.println("come문자열이 포함되어 있습니다.");
		}
		else {
			System.out.println("come문자열이 포함되어 있지 않습니다.");
		}
		
		// 영문자가 포함되어 있는가?
		if(str.matches(".*[a-zA-Z].*")) {
			System.out.println("문자열에 영문자가 포함되어 있습니다.");
		}
		else {
			System.out.println("문자열에 영문자가 포함되어 있지 않습니다.");
		}
		
		// 숫자가 포함되어 있는가?
		if(str.matches(".*[0-9].*")) {
			System.out.println("문자열에 숫자가 포함되어 있습니다.");
		}
		else {
			System.out.println("문자열에 숫자가 포함되어 있지 않습니다.");
		}
		
	}
}
