package t5_HashMap;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		// HashMap 선언 :  HashMap<키타입, 값타입> 변수 = new HashMap();
		HashMap<Integer, String> vos = new HashMap<Integer, String>();
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println();
		
		vos.put(10,"Java");
		vos.put(20,"JSP");
		vos.put(30,"HTML5");
		vos.put(40,"CSS3");
		vos.put(50,"javascript");
		
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		// 키값 30번 자료 읽기
		String item = vos.get(30);
		System.out.println("키값 30의 요소는? " + item);
		System.out.println();
		
		// 키값 30번 삭제하기
		//vos.remove("JSP");
		vos.remove(30);
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		// 모두 삭제
		vos.clear();
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
	}
}
