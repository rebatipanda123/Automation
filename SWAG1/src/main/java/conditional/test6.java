package conditional;

public class test6 {

	public static void main(String[] args) {
		
	//Write a Java program to check whether a given year is a leap year or not using if-else.
		 
		int year = 1900	;
		boolean isleap = false;
		if (year % 4 == 0);
		if (year % 100 != 0 || year % 400 == 0 ) {
		 isleap = true;
		}
	
	if (isleap)	{
		System.out.println("year + the year is a leapyear");
	}
	else {
		System.out.println("year + the year is not a leapyear");
	}
		
		
		
			}
}
			
		
		
		
	


