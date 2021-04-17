package t6_Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Iterator : 반복지시자(컨테이너에 담겨져 있는 값들을 하나씩 처리해 준다.)
// 주요메소드 : hasNext() - 자료가 있으면 true, next() - 다음 자료 처리
public class Test3 {
	public static void main(String[] args) {
		//HashMap<Integer, String> vos = new HashMap();
		Map<Integer, String> vos = new HashMap();
		
		vos.put(10,"Java");
		vos.put(20,"JSP");
		vos.put(30,"HTML5");
		vos.put(40,"CSS3");
		vos.put(50,"javascript");
		
		Iterator hs = vos.keySet().iterator();
		while(hs.hasNext()) {
			String item = (String) vos.get(hs.next());
			System.out.println("요소 : " + item);
		}
		System.out.println("요소의 갯수 : " + vos.size());
	}
}
