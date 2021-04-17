package api1;

public class Object1Run2 {
	public static void main(String[] args) {
		Object1 obj1 = new Object1("냉장고");
		Object1 obj2 = new Object1("냉장고");
		Object1 obj3 = new Object1("에어컨");
		
		Object1Vo vo = new Object1Vo();
		vo.name = "냉장고";
		
		if(obj1 == obj2) {  // == 연산자는 주소를 비교합니다.
			System.out.println("1.obj1과 obj2는 동동한 객체입니다.");
		}
		else {
			System.out.println("1.obj1과 obj2는 동동하지 않은 객체입니다.");
		}
		System.out.println();
		
		if(obj1.equals(obj2)) {  // equals() 메소드는 주소가 가리키는곳의 값을 비교합니다.
			System.out.println("2.obj1과 obj2는 동동한 객체입니다.");
		}
		else {
			System.out.println("2.obj1과 obj2는 동동하지 않은 객체입니다.");
		}
		
		if(obj1.equals("냉장고")) {  // equals() 메소드는 주소가 가리키는곳의 값을 비교합니다.
			System.out.println("3.obj1객체 안에 저장된 값은 '냉장고'입니다.");
		}
		else {
			System.out.println("3.obj1객체 안에 저장된 값은 '냉장고'가 아닙니다.");
		}
		
		System.out.println("obj1 : " + obj1);
		
		if(obj1.su.equals(obj2.su)) {
			System.out.println("4.obj1과 obj2는 동동한 객체입니다.");
		}
		else {
			System.out.println("4.obj1과 obj2는 서로 다른입니다.");
		}
		
	}
}
