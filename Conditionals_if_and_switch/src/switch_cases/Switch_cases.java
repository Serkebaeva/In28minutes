package switch_cases;

public class Switch_cases {

	public static void main(String[] args) {
		Switch_cases calendar = new Switch_cases();

		calendar.determineNameOfday(3);
		calendar.isWeekday();
		calendar.determineNameOfMonth(6);


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

	public void determineNameOfMonth(int monthNumber) {
		this.monthNumber = monthNumber;
		switch (monthNumber) {
		case 1:
			System.out.println("1st month of the year is a January");
			break;
		case 2:
			System.out.println("2nd month of the year is a February");
			break;
		case 3:
			System.out.println("3rd month of the year is a March");
			break;
		case 4:
			System.out.println("4th month of the year is an April");
			break;
		case 5:
			System.out.println("5th month of the year is a May");
			break;
		case 6:
			System.out.println("6th month of the year is a June");
			break;
		case 7:
			System.out.println("7th month of the year is a July");
			break;
		case 8:
			System.out.println("8th month of the year is an August");
			break;
		case 9:
			System.out.println("9th month of the year is a September");
			break;
		case 10:
			System.out.println("10th month of the year is an October");
			break;
		case 11:
			System.out.println("11th month of the year is a November");
			break;
		case 12:
			System.out.println("12th month of the year is a December");
			break;			
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
