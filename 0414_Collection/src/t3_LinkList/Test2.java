package t3_LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("컬렉션의 수행속도 비교!!!");
		
		List<String> vos1 = new ArrayList<String>();
		List<String> vos2 = new Vector<String>();
		List<String> vos3 = new LinkedList<String>();
		
		long sTime, eTime;
		
		sTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			vos1.add(0,"");
		}
		eTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간: \t" + (eTime - sTime) + "ns");
		System.out.println();
		
		sTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			vos2.add(0,"");
		}
		eTime = System.nanoTime();
		System.out.println("Vector의 수행시간: \t" + (eTime - sTime) + "ns");
		System.out.println();
		
		sTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			vos3.add(0,"");
		}
		eTime = System.nanoTime();
		System.out.println("LinkedList의 수행시간: \t" + (eTime - sTime) + "ns");
		System.out.println();
		System.out.println("작업끝..");
	}
}
