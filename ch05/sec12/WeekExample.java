package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_WEEK);
		
		switch (day) {
		case 1:	today =	Week.SUNDAY;	break;
		case 2:	today =	Week.MONDAY;	break;
		case 3:	today =	Week.TUESDAY;	break;
		case 4:	today =	Week.WEDNSDAY;	break;
		case 5:	today =	Week.THURSDAY;	break;
		case 6:	today =	Week.FRIDAY;	break;
		case 7:	today =	Week.SATURDAY;	break;

		}
		
		
		if (today == Week.FRIDAY) {
			System.out.println("Today is Friday");
		} else {
			System.out.println("not Friday");
			
		}
	}
}
