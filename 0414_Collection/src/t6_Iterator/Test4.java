package t6_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class Test4 {
	public static void main(String[] args) {
		ArrayList<Integer> vos = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		
		// Iterator객체를 이용한 vos값 가져오기
		Iterator<Integer> item = vos.iterator();
		while(item.hasNext()) {
			int su = item.next();
			System.out.println("su : " + su);
		}
		System.out.println("==============================");
		
		// Stream객체를 이용한 vos값 가져오기
		Stream<Integer> item2 = vos.stream();
		item2.forEach(su -> System.out.println("su : " + su));
		System.out.println();
	}
}
