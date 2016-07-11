package day1;
/**
 * 
 * @author George
 *	This program will showcase a couple of examples of 
 *  printing to screen
 *	Things to learn from this program:
 *	1) Every program is wrapped by a class
 *	2) Public vs private vs protected vs default
 *	3) Different ways to comment
 *	4) The Main Method
 *	5) Different ways of printing
 */
public class FirstProgram {
	//This is a comment. When the program is converted to computer
	//language, it does not read these lines
	
	/*
	 * This
	 * is 
	 * a
	 * multi-line
	 * comment
	 * I will use comments throughout to tell you about different
	 * things
	 * hkfdhskf
	 * jfdslkafj
	 * 
	 * jlkdfgj
	 * 
	 * 
	 */
	
	/**
	 * This is a blue comment.
	 * There are generally used before methods
	 * we will talk about them more later
	 */
	
	/*
	 * Notice that the first line to gets read is 
	 * "public class FirstProgram"
	 * public is a java access modifier.
	 * For the first couple of classes we will always use public 
	 * but we will talk about different modifiers at a later time.
	 * 
	 * the word class is next.
	 * classes are used as blueprints for an object. Since this 
	 * is the first day of OOP class we will discuss what OOP 
	 * means. 
	 * 
	 * OOP stands for object oriented programming. an object is 
	 * just as you'd imagine. Basically anything can be an object.
	 * The best way to understand it is to relate it to the real 
	 * world. 
	 * Think about a car. A car has 4 wheels. A steering wheel. 
	 * It can drive, it can honk, etc. OOP was developed so we 
	 * could think of things as objects when we program them. To 
	 * program a car you know that you need to give it 4 wheels 
	 * and make it drive.
	 * 
	 * Classes are like garages that allow you to build objects 
	 * inside them. If you want to build a car, or work on a car,
	 * you need to go inside a garage to get the tools you need 
	 * to build them. It can be a hard consept to grasp at first,
	 * but as we get further it will all make sense.
	 */
	
	
	//now that we have talked about the overview, 
	//lets create our first program
	
	
	/*
	 * every class is allowed a main method that will automaticly
	 * run everytime we hit run on this class file.
	 * 
	 * I used the word method and you might not know what that is. 
	 * I like to think of methods as actions. going back to the car 
	 * example, our car needs to drive, so we would create a drive 
	 * method that would make the car drive. Now i said the main 
	 * method runs automatically. Normal methods don't run 
	 * automatically, we don't want our car to drive unless we tell
	 * it drive, otherwise it might crash. So for now, just know 
	 * that the main method will run automatically.
	 */
	
	//we create a main method like this:
	public static void main(String[] args){
		
		/*
		 * for now you can just write this down and learn to 
		 * memorize it.
		 * I had to copy and paste it into my first couple 
		 * of programs.
		 * we will go into more details on each part of 
		 * the main method later.
		 */
		
		//in every programming language you will learn, the very 
		//first program you will write will be called "hello world"
		System.out.println("Hello World");
		//this printed Hello World to the console down below. 
		
		//first program: check
		
		/*
		 * this printed a new line after hello world so if we 
		 * print something else it will appear under it
		 */
		
		System.out.print("Hello ");
		
		/*	this printed out hello under Hello World but 
		 * it did not put a new line afterward if I print
		*	something else it will be on the same line
		*/
		
		System.out.println("World");
	}
}
