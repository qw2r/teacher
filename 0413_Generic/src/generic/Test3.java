package generic;

import java.util.ArrayList;

public class Test3 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		TestVo vo = new TestVo();
		vo.setSu1(1234);
		vo.setSu2(123.4);
		vo.setName("atom");
		vo.setGender(true);
		
		TestVo vo2 = new TestVo();
		vo2.setSu1(2222);
		vo2.setSu2(222.4);
		vo2.setName("mbc");
		vo2.setGender(false);
		
		System.out.println("vo의 내용 : " + vo);
		System.out.println("vo2의 내용 : " + vo2);
		System.out.println("==========================");
		
	  // Generic을 사용한경우
		ArrayList<TestVo> vos = new ArrayList();
		vos.add(vo);
		vos.add(vo2);
		
		int cnt = 0;
		for(TestVo v : vos) {
			System.out.println("vos["+cnt+"] : " + v);
			cnt++;
		}
		
	}
}
