package t6_Iterator;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test5 {
	public static void main(String[] args) {
		int[] suArr = {10,20,30,40,50};
		
		IntStream su = Arrays.stream(suArr);
		su.forEach(num -> System.out.print(num + " "));
	}
}
