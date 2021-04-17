package t1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		ArrayList<Integer> vos = new ArrayList<Integer>();
		
		while(true) {
			System.out.print(cnt + ". 수?(종료:999) ");
			int su = sc.nextInt();
			if(su == 999) break;
			vos.add(su);
			//vos.add(sc.nextInt());
			cnt++;
		}
		
		System.out.println("원본 vos : " + vos);
		System.out.println();
		
		// 입력된 자료를 오름차순 정렬하여 출력하시오.
//		int temp = 0;
//		for(int i=0; i<vos.size()-1; i++) {
//			for(int j=i+1; j<vos.size(); j++) {
//				if(vos.get(i)>vos.get(j)) {
//					temp = vos.get(i);
//					vos.set(i, vos.get(j));
//					vos.set(j,temp);
//				}
//			}
//		}
		
		//vos.sort(null);
		Collections.sort(vos);
		
		System.out.println("원본 vos : " + vos);
		
		System.out.println("감사합니다.");
		sc.close();
	}
}
