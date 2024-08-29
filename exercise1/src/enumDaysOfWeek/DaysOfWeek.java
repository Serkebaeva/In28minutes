package enumDaysOfWeek;

enum DaysOfWeek {
	MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"),
	SATURDAY("Saturday"), SUNDAY("Sunday");

	private String name;

	DaysOfWeek(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isWeekday() {
		switch (name) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			return true;
		case "Saturday":
		case "Sunday":
			return false;
		default:
			throw new IllegalArgumentException("Invalid day: " + name);
		}
	}

	public boolean isHoliday() {
		switch (name) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			return false;
		case "Saturday":
		case "Sunday":
			return true;
		default:
			throw new IllegalArgumentException("Invalid day: " + name);
		}
	}

	/*
	 * MORE CLEAN AND SHORT SOLUTIONS: public boolean isWeekday() { return
	 * this!=SATURDAY && this!=SUNDAY }
	 * 
	 * public boolean isHoliday() { return !isWeekday(); }
	 */

	public static void main(String[] args) {
		DaysOfWeek day = DaysOfWeek.MONDAY;
		System.out.println(day.getName());
		System.out.println(day.isHoliday());
		System.out.println(day.isWeekday());
	}
}
