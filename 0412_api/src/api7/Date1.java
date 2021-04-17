package api7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("1.오늘의 날짜는? " + now);
		System.out.println("2.오늘의 날짜는? " + now.toString());
		System.out.println();
		
		// SimpleDateFormat() : 날짜 형식을 지정하는 클래스
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String strDate1 = sdf1.format(now);
		System.out.println("2021-04-12 13:25:40 : " + strDate1);
		System.out.println();
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strDate2 = sdf2.format(now);
		System.out.println("xxxx년 xx월 xx일 xx시 xx분 xx초 : " + strDate2);
	}
}
