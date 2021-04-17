package api7;

import java.util.Calendar;

public class Calendar1 {
	public static void main(String[] args) {
		// Calendar객체
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		
		System.out.println(now);
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("week : " + week);
		
		String strWeek = "";
		switch(week) {
			//case 1:
			case Calendar.SUNDAY:
				strWeek = "일";
				break;
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
		}
		System.out.println("오늘은 "+year+"년 "+month+"월 "+day+"일 "+strWeek+"요일 입니다.");
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println("현재시간은 "+hour+"시 "+minute+"분 "+second+"초 입니다.");
		System.out.println();
		System.out.println("오늘은 "+year+"년 "+month+"월 "+day+"일 "+strWeek+"요일 입니다.");
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = "";
		if(amPm == Calendar.AM) {
			strAmPm = "오전 ";
		}
		else {
			strAmPm = "오후 ";
		}
		
		int hour2 = now.get(Calendar.HOUR);
		int minute2 = now.get(Calendar.MINUTE);
		int second2 = now.get(Calendar.SECOND);
		
		System.out.println("현재시간은 "+ strAmPm + hour2+"시 "+minute2+"분 "+second2+"초 입니다.");
	}
}
