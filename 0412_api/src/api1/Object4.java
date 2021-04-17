package api1;

public class Object4 {
	private String name;
	private int su;
	
	public Object4(String name, int su) {
		super();
		this.name = name;
		this.su = su;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	
	public void prn() {
		System.out.println("Object4 = [성명 : " + name + " , 점수 : " + su + "]");
	}

	@Override
	public String toString() {
		return "Object4 [name=" + name + ", su=" + su + "]";
	}
	
	
}
