package hust.soict.dsai.lab01;
import java.util.*;
public class DaysOfAMonth {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter month:\n"
				+ "You can either enter a month in its full name, abbreviation, in 3 letters, or in number "
				+ "(e.g. January, Jan., Jan, and 1).");
		String strMonth = keyboard.nextLine().trim().toLowerCase();
		
		List<String> lstMonths = Arrays.asList("jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec",
				"jan.", "feb.", "mar.", "apr.", "may.", "jun.", "jul.", "aug.", "sep.", "oct.", "nov.", "dec.",
				"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
		List<String> lstLMonths = Arrays.asList("apr", "jun", "sep", "nov",
				"apr.", "jun.", "sep.", "nov.",
				"apr", "june", "sep", "nov",
				"4", "6", "9", "11");
		List<String> lstFMonths = Arrays.asList("feb", "feb.", "february", "2");
		int iDays;
		
		while (!lstMonths.contains(strMonth)) {
			System.out.println("Invalid month input. Re-enter:\n"
					+ "You can either enter a month in its full name, abbreviation, in 3 letters, or in number "
					+ "(e.g. January, Jan., Jan, and 1).");
			strMonth = keyboard.nextLine().trim().toLowerCase();
		}
		
		int iYear;
		System.out.println("Enter year:");
		
		while (true) {
			if (keyboard.hasNextInt()) {
                iYear = keyboard.nextInt();
                
                if (iYear >= 0) {
                	break;
                } else {
                	System.out.println("Invalid year input. Input should be non-negative. Re-enter:");
                }
			} else {
				System.out.println("Invalid year input. Input should be an integer. Re-enter:");
				keyboard.next();
			}
		}
		keyboard.close();
		
		if (lstFMonths.contains(strMonth)) {
			if (iYear % 400 == 0) {
				iDays = 29;
			} else if (iYear % 100 == 0) {
				iDays = 28;
			} else if (iYear % 4 == 0) {
				iDays = 29;
			} else {
				iDays = 28;
			}
		} else if (lstLMonths.contains(strMonth)) {
			iDays = 30;
		} else {
			iDays = 31;
		}
		
		System.out.println("There are " + iDays + " days.");
	}
}
