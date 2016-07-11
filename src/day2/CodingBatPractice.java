package day2;

/**
 * practice creating methods, and using if statements
 * @author Ross Reicks
 *
 */

public class CodingBatPractice {
	//sleep in if its not a weekday or we are on vacation
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if(!weekday || vacation)
			return true;
		
		return false;
	}
	
	//return true if a or b is 10 or a+b is 10
	public static boolean makes10(int a, int b) {
		if(a == 10 || b == 10 || a+b ==10){
			return true;
		}
		return false;
	}
	
	public static boolean hasTeen(int a, int b, int c) {
		if((a>12 && a<20) || (c>12 && c<20) || (c>12 && c<20))
			return true;
		return false;
	}
}
