package day3;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * The main object of this class is to take user input.
 * This can be used for decision making and many other things 
 * @author Ross
 *
 */
public class UserInput {
	
	public static void askName(){
		//the standard way to read in input is to use a scanner
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your name?");
		String name = in.next();
		
		System.out.println("Hello " + name);
	}
	
	public static void popupBox(){
		//a cool way to make your input cool quick is to use input boxes
		String name = JOptionPane.showInputDialog("What is your name?");
		
		System.out.println("Hello " + name);
		//if you guys like doing more graphics stuff, we can focus on that for a class
	}
	
	
	public static void main(String[] args){
		askName();
		popupBox();
	}
}
