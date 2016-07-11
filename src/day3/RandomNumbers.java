package day3;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args){
		Random r = new Random();
		
		//to pick a random number from 0 to 9 you can use:
		int randomNum = r.nextInt(10);
		
		//so, if you want a random number from 1 to 10, use:
		randomNum = 1+ r.nextInt(10);
	}
}
