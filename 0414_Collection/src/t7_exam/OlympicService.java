package t7_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OlympicService{
	
	public void avgProcess(OlympicVo vo) {
		int[] score = vo.getScore();
		int tot = 0;
		double avg;
		Arrays.sort(score);
		for(int i=1; i<=3; i++) tot += score[i];
		avg = Math.round((tot/3.0)*10)/10.0;
		vo.setAvg(avg);
	}
	
	public void resultProcess(ArrayList<OlympicVo> vos) {
		rankProcess(vos);
		prnProcess(vos);
	}

	public void prnProcess(ArrayList<OlympicVo> vos) {
		System.out.println("\t*************  올림픽 체조경기 최종결과  ****************");
		System.out.println("====================================================================");
		System.out.println("성명\t종목\t점수1\t점수2\t점수3\t점수4\t점수5\t평균\t순위");
		System.out.println("--------------------------------------------------------------------");
		for(OlympicVo vo : vos) {
			System.out.print(vo.getName()+"\t"+vo.getJongMok()+"\t");
			for(int j=0; j<5; j++) {
				System.out.print(vo.getScore()[j]+"\t");
			}
			System.out.print(vo.getAvg()+"\t"+vo.getRank());
			System.out.println();
		}
		System.out.println("====================================================================");
	}

	public void rankProcess(ArrayList<OlympicVo> vos) {
		Collections.sort(vos);
		
		for(int i=0; i<vos.size(); i++) {
			vos.get(i).setRank(i+1);
		}
	}

}
