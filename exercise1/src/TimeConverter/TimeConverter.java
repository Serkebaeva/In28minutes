package TimeConverter;

public class TimeConverter {

	public static int convertHoursToMinutes(int hours) {
		// Your task: complete this method
		System.out.printf("Minutes in given %d hours = %d ", hours, hours * 60).println();
		return hours * 60;
	}

	public static int convertDaysToMinutes(int days) {
		// Your task: complete this method
		System.out.printf("Minutes in given %d days = %d ", days, days * 24 * 60).println();
		return days * 24 * 60;
	}


}
