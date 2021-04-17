package t7_exam;

import java.util.Arrays;

public class OlympicVo implements Comparable<OlympicVo> {
	private String name;
	private String jongMok;
	private int[] score = new int[5];
	private double avg;
	private int rank;
	
	@Override
	public int compareTo(OlympicVo vo) {				// 내림차순
		if(this.avg < vo.getAvg()) return 1;
		else if(this.avg > vo.getAvg()) return -1;
		else return 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJongMok() {
		return jongMok;
	}
	public void setJongMok(String jongMok) {
		this.jongMok = jongMok;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "OlympicVo [name=" + name + ", jongMok=" + jongMok + ", score=" + Arrays.toString(score) + ", avg=" + avg
				+ ", rank=" + rank + "]";
	}
}
