package isLeapYear;

public class IsLeapYear {
    public boolean isLeapYear(int year) {
      if (year < 1 ){
           return false;
      }
      
      if (year % 4 != 0) {
           return false;
      }
      
      if (year % 4 == 0 && year % 100 != 0) {
           return true;
      }
      
      if (year % 4 == 0 && year % 100 == 0) {
            
            if (year % 400 == 0) {
             return true;
            }
    
        return false;
      }
      
      return false;
      
    }
    
    public static void main (String[] args) {
		IsLeapYear year = new IsLeapYear();
		System.out.println(year.isLeapYear(2041));// false
		System.out.println(year.isLeapYear(2048));// true
		System.out.println(year.isLeapYear(2000));// true
		System.out.println(year.isLeapYear(2400));// true
		System.out.println(year.isLeapYear(2100));// false
		System.out.println(year.isLeapYear(2200));// false
		System.out.println(year.isLeapYear(2300));// false
    }
}
