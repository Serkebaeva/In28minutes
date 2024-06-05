package switch_cases;

public class Switch_cases {

	public static void main(String[] args) {
		Switch_cases calendar = new Switch_cases();

		calendar.determineNameOfday(3);
		calendar.isWeekday();
		System.out.println(determineNameOfMonth(6));


	}

	private int dayNumber;
	private int monthNumber;

	public void determineNameOfday(int dayNumber) {
		this.dayNumber = dayNumber;
		switch (dayNumber) {

		case 1:
			System.out.println("First day of the week is: a Monday");
			break;
		case 2:
			System.out.println("Second day is: a Tuesday");
			break;
		case 3:
			System.out.println("Third day of the week is: a Wednesday");
			break;
		case 4:
			System.out.println("Fourth day of the week is: a Thursday");
			break;
		case 5:
			System.out.println("Fifth day of the week is: a Friday");
			break;
		case 6:
			System.out.println("Sixth day of the week is: a Saturday");
			break;
		case 7:
			System.out.println("Seventh day of the week is: a Sunday");
			break;
		default:
			System.out.println("Invalid input!");
			break;
		}

	}

	public void isWeekday() {
		switch (dayNumber) {
		case 0:
			System.out.println("Sunday: is a Week End!");
			break;
		case 1:
			System.out.println("Monday: is a weekday");
			break;
		case 2:
			System.out.println("Tuesday: is a weekday");
			break;
		case 3:
			System.out.println("Wednesday: is a weekday");
			break;
		case 4:
			System.out.println("Thursday: is a weekday");
			break;
		case 5:
			System.out.println("Friday: is a weekday");
			break;
		case 6:
			System.out.println("Saturday: is a Week End!");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "1st month of the year is a January";
		case 2:
			return "2nd month of the year is a February";
		case 3:
			return "3rd month of the year is a March";
		case 4:
			return "4th month of the year is an April";
		case 5:
			return "5th month of the year is a May";
		case 6:
			return "6th month of the year is a June";
		case 7:
			return "7th month of the year is a July";
		case 8:
			return "8th month of the year is an August";
		case 9:
			return "9th month of the year is a September";
		case 10:
			return "10th month of the year is an October";
		case 11:
			return "11th month of the year is a November";
		case 12:
			return "12th month of the year is a December";

		}
		return "Invalid input";
	}

}
