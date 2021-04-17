package api4;

public class String4 {
	public static void main(String[] args) {
		String tel = "010-1234-5678";
		
		// split() : 특정문자로 분리시켜주는 메소드
		String[] telArr = tel.split("-"); 
		
		System.out.println("tel : " + tel);
		for(String item : telArr) {
			System.out.print(item + " ");
		}
		
		// 2(n)개 배열값으로 분리
		String[] telArr1 = tel.split("-", 2); 
		
		System.out.println("tel : " + tel);
		for(String item : telArr1) {
			System.out.print(item + " ");
		}
		
		
	}
}
