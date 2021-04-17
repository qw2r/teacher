package api4;

import java.io.UnsupportedEncodingException;

public class String7 {
	public static void main(String[] args) {
		// getBytes() : 문자열을 '바이트배열'로 변환
		String str = "안녕하세요!";
		
		System.out.println("원본 : " + str.length());
		
		// 일반 적인 처리방법
		byte[] b = str.getBytes();  // 인코딩
		System.out.println("b.length : " + b.length);
		System.out.println("b : " + b);
		String res = new String(b);  // 디코딩
		System.out.println("디코딩 결과 : " + res);
		System.out.println();
		
		// EUC-KR로 인코딩/디코딩
		try {
			byte[] b2 = str.getBytes("EUC-KR");
			System.out.println("b2.length : " + b2.length);
			System.out.println("b2 : " + b2);
			String res2 = new String(b2, "EUC-KR");  // 디코딩
			System.out.println("디코딩 결과 : " + res2);
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 오류....");
			e.printStackTrace();
		}
		System.out.println();
		
  	// UTF-8로 인코딩/디코딩
		try {
			byte[] b2 = str.getBytes("UTF-8");
			System.out.println("b2.length : " + b2.length);
			System.out.println("b2 : " + b2);
			String res2 = new String(b2, "UTF-8");  // 디코딩
			System.out.println("디코딩 결과 : " + res2);
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 오류....");
			e.printStackTrace();
		}
	}
}
