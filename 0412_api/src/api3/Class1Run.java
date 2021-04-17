package api3;

public class Class1Run {
	public static void main(String[] args) {
		try {
			Class.forName("api3.Class1");
			System.out.println("Class1클래스는 api3패키지에 존재합니다.");
			
			Class class1Infor = Class1.class;
			
			System.out.println("getName() : " + class1Infor.getName());
			System.out.println("getPackageName() : " + class1Infor.getPackageName());
			System.out.println("getTypeName() : " + class1Infor.getTypeName());
			System.out.println("getSimpleName() : " + class1Infor.getSimpleName());
		} catch (ClassNotFoundException e) {
			System.out.println("Class1클래스는 api3패키지에 존재하지 않습니다.");
		}
		
	}
}
