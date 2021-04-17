package t6_Iterator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test6 {
	public static void main(String[] args) {
		List<Test6Vo> vos = Arrays.asList(
				new Test6Vo("홍길동", 25),
				new Test6Vo("김말숙", 37),
				new Test6Vo("이기자", 29)
		);
		
		Stream<Test6Vo> vo = vos.stream();
		vo.forEach(v -> System.out.println("이름:" + v.getName()
												+ " , 나이:" + v.getAge()));
	}
}
