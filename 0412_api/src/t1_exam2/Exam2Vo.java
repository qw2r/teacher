package t1_exam2;

// 계산에 필요한 변수를 담아놓기위한 객체
public class Exam2Vo {
	private int su1;
	private int su2;
	private String operator;
	
	private double res;					// 계산 결과를 담아놓기위한 필드
	
	public int getSu1() {
		return su1;
	}
	public void setSu1(int su1) {
		this.su1 = su1;
	}
	public int getSu2() {
		return su2;
	}
	public void setSu2(int su2) {
		this.su2 = su2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double getRes() {
		return res;
	}
	public void setRes(double res) {
		this.res = res;
	}
	@Override
	public String toString() {
		return "Exam2Vo [su1=" + su1 + ", su2=" + su2 + ", operator=" + operator + ", res=" + res + "]";
	}
}
