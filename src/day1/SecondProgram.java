package day1;
	/**
	 * This is the second program that we will write
	 * @author Ross
	 *	Things to learn in this program:
	 *	1) numbers and math
	 *	2) how to store stuff
	 *	3) different types of stuff
	 */
	
	import java.math.*; //the math library
	
	public class SecondProgram {
		
		public static void main(String[] args){
			/*
			 * A good amount of functional programming is about 
			 * computing things or at least using numbers to 
			 * help you. Hopefully you are good with numbers
			 */
			
			//java has a lot of remedial math functions build in:
			System.out.println(2+2); //addition
			System.out.println(3-1); //subtraction
			System.out.println(2*3); //multiplication
			System.out.println(8/2); //division
			System.out.println(9%2); //modulus. 
			/*
			 * in math we call it the remainder: 
			 * 9/2 = 4 remainder 1. this will print 1
			 */
			
			//another useful feature is true or false statements
			System.out.println(8<3); //is 8 less than 3?
			System.out.println(8!=9);
			// should print false
			System.out.println(8==8); //is 8 equal to 8?
			// should print true. notice the double equals sign!
			
			/*
			 * we can also include a ton more math function 
			 * using the math library (notice line 10)
			 */
			System.out.println(Math.sqrt(4)); //square root
			System.out.println(Math.PI); //pi
			System.out.println(Math.cos(0)); //cos, sin, tan, 
			//arcSin, arcCos, arcTan etc.
			
			//a whole list of math fuctions can be found on the java
			//documentation site.
			
			/*
			 * So cool, we now know how to do basic math we 
			 * could probably do in our head. but what if we 
			 * want to calculate something and then use it later?
			 */
			
			int wheels;
			
			/*
			 * notice we used the word int, this is used to tell 
			 * java that this will be an integer. 
			 * These are used so that java can tell us if we 
			 * have errors anywhere and just to make sure we 
			 * don't do anything the computer wont like.
			 */
			wheels = 2+2;
			
			//we can also save decimal values
			double pi = 3.14;
			
			//or text
			String message = "This is a text variable";
			
			message.toLowerCase();
			
			System.out.println(wheels);
			System.out.println(pi);
			System.out.println(message);
			
		}
		
	}
