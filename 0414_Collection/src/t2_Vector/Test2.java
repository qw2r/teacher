package t2_Vector;

import java.util.Vector;

public class Test2 {
	public static void main(String[] args) {
		Vector<String> vos = new Vector<String>(4);  // 크기(용량)를 4로 제한
		
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println("vos의 용량 : " + vos.capacity());
		System.out.println();
		
		vos.add("홍길동");
		vos.add("김말숙");
		vos.add("이기자");
		vos.add("소나무");
		vos.add("고인돌");
		
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println("vos의 용량 : " + vos.capacity());
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.set(2, "오하늘");
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.remove(2);
		System.out.println("vos : " + vos);
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println();
		
		vos.clear();
		System.out.println("vos : " + vos);
		System.out.println("vos의 크기 : " + vos.size());
		System.out.println();
		
	}
}
