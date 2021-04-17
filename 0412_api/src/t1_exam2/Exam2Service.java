package t1_exam2;

public class Exam2Service {
	public void add(Exam2Vo vo) {
//		double res = vo.getSu1() + vo.getSu2();
//		vo.setRes(res);
		vo.setRes(vo.getSu1() + vo.getSu2());
		resPrint(vo);
	}
	
	public void subtract(Exam2Vo vo) {
		vo.setRes(vo.getSu1() - vo.getSu2());
		resPrint(vo);
	}
	
	public void multiply(Exam2Vo vo) {
		vo.setRes(vo.getSu1() * vo.getSu2());
		resPrint(vo);
	}
	
	public void divide(Exam2Vo vo) {
		vo.setRes(vo.getSu1() / vo.getSu2());
		resPrint(vo);
	}
	
	public void resPrint(Exam2Vo vo) {
		System.out.println(vo.getSu1() + vo.getOperator() + vo.getSu2() + "=" + vo.getRes());
	}
}
