package day4;

import java.util.ArrayList;

//Sometimes you will want to save more than one value as a variable, but not want to create a whole bunch of variables
//keeping things as a array is a good choice
public class ListsAndLoops {
	
	public static void main(String[] args){
		int[] OneToTen = {1,2,3,4,5,6,7,8,9,10} ;
		
		//arrays can be one of the more compicated things in programming
		//arrays cannot be printed all at once with system.out
		//arrays are indexed starting at 0;
		
		//if I want to print the first thing in the array:
		System.out.println(OneToTen[0]);
		//this prints the thing in the 0th index
		
		//to print the whole array, you need to do a little more work:
		for(int i = 0; i < OneToTen.length; i++){
			System.out.print(OneToTen[i] + " ");
		}
		
		ArrayList list = new <Integer> ArrayList();
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.toString());
		
		for(int number: OneToTen){
			number+=4;
		}
		for(int number: OneToTen){
			System.out.print(number);
		}
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
}
}
