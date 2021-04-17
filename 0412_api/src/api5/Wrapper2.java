package api5;

public class Wrapper2 {
	public static void main(String[] args) {
		// 자동박싱
		int su1 = 100;
		//Integer obj1 = new Integer(su1);
		Integer obj1 = su1;   // int obj1 = su;  (x)
		String obj2 = "200";
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println();
		
		// 자동 언박싱
		// int var1 = obj1.intValue();
		int var1 = obj1;
		System.out.println("var1 : " + var1);
		System.out.println("var1 + 500 : " + (var1 + 500));
		
		System.out.println("var1 == obj1 : " + (var1 == obj1));
		
		int res = obj1 + var1;
		System.out.println("res = " + res);
	}
}
