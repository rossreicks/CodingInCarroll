package day3;

import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
	public static void main(String[] args){
		Random r = new Random();
		int randomNumber = 1 + r.nextInt(100); //get a number between 1 and 100
		
		Scanner in = new Scanner(System.in);
		System.out.print("Pick a number between 1 and 100 ");
		int guess = 0;
		int count = 0;
		
		while(guess != randomNumber){
			guess = in.nextInt();
			count++;
			if(guess>randomNumber){
				System.out.print("Guess something lower ");
			}
			else if(guess<randomNumber){
				System.out.print("Guess something higher ");
			}
			else{
				System.out.print("You guessed it!! It only took you " + count + " trys!");
			}
		}
	}
}
