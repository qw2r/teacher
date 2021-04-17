package api5;

public class Wrapper1 {
	public static void main(String[] args) {
		// Byte, Short, Character, Long, Integer, Float, Double , Boolean
		// 박싱(Boxing)
		int su1 = 100;
		String su2 = "200";
		
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println("su1 + su2 : " + (su1 + su2));  // 결과: 100200
		System.out.println();
		
		Integer obj1 = new Integer(su1);  // 기본 정수타입을 정수형객체(참조타입)로 Boxing
		Integer obj2 = new Integer(su2);
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj1 : " + (obj1+500));
		System.out.println("obj1 + obj2 : " + (obj1+obj2)); // 결과 : 300
		System.out.println();
		
		// 언박싱(UnBoxing)
		int var1 = obj1.intValue();
		int var2 = obj2.intValue();
		double var3 = obj2.doubleValue();
		//String var4 = (String) obj2;
		System.out.println("var1 : " + var1);
		System.out.println("var1 : " + (var1+500));
		System.out.println("var1 + var2 : " + (var1+var2)); // 결과 : 300
		System.out.println("var3 : " + var3);
		System.out.println();
		
	}
}
