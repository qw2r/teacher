package api7;

import java.text.DecimalFormat;

public class DecimalFormat1 {
	public static void main(String[] args) {
		int su1 = 1234567;
		//int su1 = 0;
		double su2 = 1234.567;
		
		DecimalFormat df1 = new DecimalFormat("#,###");
		DecimalFormat df2 = new DecimalFormat("#,###.0");
		
		System.out.println("df1 : " + df1.format(su1));
		System.out.println("df2 : " + df2.format(su2));
	}
}
