package generic;

import java.util.ArrayList;

public class Test2 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	  // Generic을 사용한경우
		//ArrayList<String> list1 = new ArrayList();
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("1234");
		list1.add("123.4");
		list1.add("atom");
		list1.add("true");
		
//		int li0 = (int) list1.get(0);
//		double li1 = (double) list1.get(1);
//		String li2 = (String) list1.get(2);
//		boolean li3 = (boolean) list1.get(3);
		
//		System.out.println("li0 : " + li0);
//		System.out.println("li1 : " + li1);
//		System.out.println("li2 : " + li2);
//		System.out.println("li3 : " + li3);

		String[] temp = new String[list1.size()];
		for(int i=0; i<list1.size(); i++) {
			temp[i] = list1.get(i);
		}
		
		int cnt = 0;
		for(String str : temp) {
			System.out.println("temp["+cnt+"] : " + str);
			cnt++;
		}
		
	}
}
