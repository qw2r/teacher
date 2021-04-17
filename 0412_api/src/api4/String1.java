package api4;

public class String1 {
	public static void main(String[] args) {
		// charAt() : 특정위치의 값을 가져온다.
		//           0         1
		//           01234567890123
		String sn = "991025-2123450";
		
		char gender = sn.charAt(7);
		
		switch(gender) {
			case '1': case '3':
				System.out.println("남자");
				break;
			//case '2':
			default:
				System.out.println("여자");
				break;
		}
		System.out.println("작업끝.");
	}
}
