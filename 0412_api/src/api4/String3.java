package api4;

public class String3 {
	public static void main(String[] args) {
		String str1 = "Hello!";
		String str2 = "Hello!";
		String str3 = "Aha~ Hello!";
		String str4 = "Za~ Hello~";
		String str5 = "aha~ Hello~";
		String str6 = "hello!";
		String str7 = "  hello!  ";
		String str8 = " h e l l o ! ";
		
		// compareTo() : 문자열을 사전순으로 비교한다.
		// 비교값이 '0'이면 '같다', 음수면 뒤에나오고, 양수면 앞선글자다
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str5));
		System.out.println(str1.compareTo(str6));
		
		// compareToIgnoreCase() : 대소문자를 구별없이 비교...
		System.out.println(str1.compareToIgnoreCase(str6));
		
		// startsWith(), endswith() : 접두사와 접미사 비교.
		System.out.println(str3.endsWith(str1));
		System.out.println(str3.startsWith(str1));
		
		// concat() : 문자열의 결합
		System.out.println(str1.concat(str3));
		
		// trim() : 앞 뒤의 공백무시
		System.out.println(str1 + str7 + str2);
		System.out.println(str1 + str7.trim() + str2);
		
		// replaceAll() : 지정문자열을 변경문자열로 모두 치환
		System.out.println(str1 + str8 + str2);
		System.out.println(str1 + str8.replaceAll(" ", "") + str2);
		
	}
}
