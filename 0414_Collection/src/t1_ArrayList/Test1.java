package t1_ArrayList;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		//List<String> vos = new ArrayList<String>();
		ArrayList<String> vos = new ArrayList<String>();
		
		vos.add("Java");
		vos.add("JSP");
		vos.add("Database");
		vos.add("HTML5");
		vos.add("CSS3");
		vos.add("Javascript");
		vos.add("jQuery");
		vos.add("AJax");
		
		System.out.println("vos[3] : " + vos.get(3));  // 인덱스 3번 내용 보기 
		System.out.println();
		
		for(int i=0; i<vos.size(); i++) {
			System.out.println("vos["+i+"] : " + vos.get(i));
		}
		System.out.println();
		
		System.out.println("vos[1] : " + vos.get(1));
		System.out.println();
		
		vos.set(1, "SpringFramework");  // 인덱스 1번의 내용을 'SpringFramework'변경
		System.out.println("vos[1] : " + vos.get(1));
		System.out.println("vos의 크기? " + vos.size());
		System.out.println();
		
		vos.remove(1);
		System.out.println("vos[1] : " + vos.get(1));
		System.out.println("vos의 크기? " + vos.size());
		System.out.println();
		
		System.out.println("vos 전체 출력");
		System.out.println("vos : " + vos);
		System.out.println("===========================================");
		
		// 변수를 이용...(3번지의 값을 2번지로 복사(덮어쓰기))
		System.out.println("vos[3] : " + vos.get(3));
		String temp = vos.get(3);
		System.out.println("temp : " + temp);
		vos.set(2,temp);
		System.out.println("원본vos : " + vos);
		System.out.println();
		
		// 변수를 이용...(3번지의 값과 0번지의 값을 변경)
		temp = vos.get(3);
		vos.set(3,vos.get(0));
		vos.set(0,temp);
		System.out.println("변경후vos : " + vos);
		System.out.println("vos의 크기 :" + vos.size());
		System.out.println();
		
		// vos의 모든자료 삭제
		vos.clear();
		System.out.println("변경후vos : " + vos);
		System.out.println("vos의 크기 :" + vos.size());
		System.out.println();
		
		vos = null;
		//System.out.println("vos의 크기 :" + vos.size());
		System.out.println("변경후vos : " + vos);
	}
}
