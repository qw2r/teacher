package api3;

public class Class2 {
	public static void main(String[] args) {
		Class class2 = Class1.class;
		
//		String path1 = class2.getResource("1.jpg").getPath();
//		System.out.println("path1 = " + path1);
		String path1 = class2.getResource("./images/1.jpg").getPath();
		System.out.println("path1 = " + path1);
		System.out.println();
		
		String path2 = class2.getResource("../api2/img2/2.jpg").getPath();
		System.out.println("path2 = " + path2);
	}
}
