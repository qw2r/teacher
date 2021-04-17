package t4_Set;

import java.util.HashSet;

public class Test1 {
	public static void main(String[] args) {
		HashSet<String> vos = new HashSet<String>();
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println();
		
		vos.add("Java");
		vos.add("JSP");
		vos.add("HTML5");
		vos.add("CSS3");
		vos.add("javascript");
		
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		// vos.set();    // 지정 위치의 내용수정 불가...(중복 불허)
		//vos.remove(1); // 인덱스위치를 찾을수 없다.
		vos.remove("JSP");
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		// 전체 삭제
		vos.clear();
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
	}
}
