package t6_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Iterator : 반복지시자(컨테이너에 담겨져 있는 값들을 하나씩 처리해 준다.)
// 주요메소드 : hasNext() - 자료가 있으면 true, next() - 다음 자료 처리
public class Test2 {
	public static void main(String[] args) {
		//ArrayList<String> vos = new ArrayList<String>();
		Collection<String> vos = new ArrayList<String>();
		
		vos.add("Java");
		vos.add("JSP");
		vos.add("HTML5");
		vos.add("CSS3");
		vos.add("javascript");
		
		Iterator hs = vos.iterator();
		while(hs.hasNext()) {
			String item = (String) hs.next();
			System.out.println("요소 : " + item);
		}
		System.out.println("요소의 갯수 : " + vos.size());
	}
}
