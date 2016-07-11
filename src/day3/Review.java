package day3;

/*
 * Some things to review:
 * If statements
 * Control flow
 * Creating methods
 * Main method
 * String methods
 * default Constructors
 * creating objects
 */

import imports.Printer;

public class Review extends Printer{
	public void ifStatements(){
		//the basis of if statements are based around true and false boolean values
		boolean isTrue = true;
		//booleans can only contain values true or false
		
		if(true){
			Print("This will always print");
		}
		if(false){
			System.out.println("This will never print");
		}
		
		if(isTrue && true){
			System.out.println("The && is used when you want to see if two things are true");
		}
		
		if(isTrue || false){
			System.out.println("The || is used if either are true to continue");
		}
	}
	
	public void controlFlow(){
		int x = 12;
		
		//control flow is used if you want to do more than two things depending on the outcome of something:
		
		if(x<5){
			System.out.println("X is a small number");
		}
		else if(x < 15){
			System.out.println("X is a pretty big number");
		}
		else{
			System.out.println("X is massive number");
		}
		
		//remember you most end with an else statement unless you have covered every possible scenario.
		boolean isTrue = true;
		if(isTrue){
			System.out.println("isTrue is true");
		}
		else if(!isTrue){
			System.out.println("isTrue is false");
		}
	}
	
	public static void StringMethods(){
		String str = "Mississippi";
		//length method with tell how many characters are in a string
		int length = str.length();
		System.out.println(length);
		
		//charAt returns the character at a specific index.
		//remember that indexing in java starts ar 0.
		char firstLetter = str.charAt(0);
		System.out.println(firstLetter);
		
		//remember to get the last letter of a word use length-1
		char lastLetter = str.charAt(str.length()-1);
		System.out.println(lastLetter);
		
		//to see if a string contains a certain character or phrase, use contains
		boolean isX = str.contains("x"); //should return false for string Mississippi
		System.out.println(isX);
		
		//if you want a certain part of a word, you can use substring
		String firstHalf = str.substring(0, str.length()/2);
		System.out.println(firstHalf);
		
		//remember that you cannot use == or any other primative comparisons with Strings or any other objects
		//instead you need to use the equals method
		boolean equals = str.equals("Mississipi");
		System.out.println(equals);
	}
	
	//we will always be writing main methods, so memorize, memorize, memorize
	public static void main(String[] args){
		//in object oriented styling, you want to create an instance of your class to call methods on
		//in basic functional classes like this, we don't need a constructor
		//java creates a default constructor for us that takes no parameters and has no return type
		//you can imagine it like this:
		/*
		 * public Review(){}
		 * You could add this line to the top of your code, but it would be redudant and bad practice
		 */
		
		//you create a new object like this:
		Review review = new Review();
		
		//now we can call methods on this object:
		review.controlFlow();
		review.ifStatements();
		StringMethods();
	}
}
