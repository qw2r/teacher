package generic;

import java.util.ArrayList;

public class Test1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// Generic을 사용하지 않은경우
		ArrayList list1 = new ArrayList();
		
		list1.add(1234);
		list1.add(123.4);
		list1.add("atom");
		list1.add(true);
		
		int li0 = (int) list1.get(0);
		double li1 = (double) list1.get(1);
		String li2 = (String) list1.get(2);
		boolean li3 = (boolean) list1.get(3);
		
		System.out.println("li0 : " + li0);
		System.out.println("li1 : " + li1);
		System.out.println("li2 : " + li2);
		System.out.println("li3 : " + li3);
	}
}
