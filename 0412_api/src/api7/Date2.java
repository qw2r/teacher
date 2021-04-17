package api7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {
	public static void main(String[] args) {
		try {
			// "2021-04-14"날짜형식의 문자열을 '2021년 4월 14일'형식으로 만들기 
			String textDate = "2021-04-14";
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date now = format.parse(textDate);  // 문자형을 날짜형식으로 변경
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 M월 d일");  // 날짜형식을 날짜지정포멧으로 변경
			String strDate = format1.format(now);
			System.out.println("2121년 4월 14일 : " + strDate);
		} catch (ParseException e) {
			System.out.println("날짜 포멧 오류..");
		}
	}
}
