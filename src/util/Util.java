package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	public static String getdate() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date now = new Date();
		
		
		 String nowTime1 = sdf1.format(now);
		 
		 return nowTime1;
	}
}
