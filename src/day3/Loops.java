package day3;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args){
		/*
		 * Loops are a very powerful tool in programming
		 * They work a lot like guess and check
		 * say you want to figure out how many years it takes for your saving to accumulate to a desired amount
		 * you could try 1 year, calculate your money and see if its enough, if not, try the next year and so on
		 * loops do things over and over again.
		 */
		
		//lets say we want to print out the numbers from 1 to 10
		int desiredNumber = 10;
		int currentNumber = 1;
		
		while(currentNumber<=desiredNumber){
			System.out.print(currentNumber + " ");
			currentNumber++; //same at currentNumber + 1
		}
		
		/*
		 * this loop is saying, if current number is less than or equal to 10,
		 * print it and add one to the current number and repeat until its not less than or equal to 10
		 */
		System.out.println('\n');
		//for loops is another type of loop, it is based on the while loop
		for(currentNumber = 1; currentNumber <= desiredNumber; currentNumber++){
			System.out.print(currentNumber);
		}
		
		/*
		 * A for loop has three parameters:
		 * 1) the starting index: we want to our current number to start at 1 because we are counting 1 to 10
		 * 2) the condition: stop when the condition is false. We want to stop when the currentNumber is greater than the desired Number
		 * 3) what we want to happen at the end of each loop: in our case, increment the current number by 1
		 */
		
		//A good use of the while loop is in user input:
		Scanner in = new Scanner(System.in);
		
		double total = 0;
		int count = 0;
		
//		while(in.hasNextDouble()){
//			double next = in.nextInt();
//			total = total + next;
//			count++;
//			System.out.println(total/count);
			
//		}
		
		for(int i = 0; in.hasNextDouble();i++){
			double next = in.nextDouble();
			total = total + next;
			System.out.println(total/i);
		}
		//this will keep a running total of every number you put in
	}
}
