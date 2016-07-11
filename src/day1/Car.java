package day1;
/**
 * This could be the first real eventful program.
 */
public class Car {
	/*
	 * Instance Variables: Instance Variables are used to store
	 * information about your object. Say how many tires you 
	 * have or the color of the car.
	 * Instance means they can then be used in all the methods 
	 * including main, but they can be changed by each object. 
	 * Lets say you have two cars you might want one to be 
	 * red and one to be green. Its a good idea to make them
	 * instance variables.  
	 */
	private String color;
	private int miles;
	/*
	 * This is a good time to talk about private vs public. 
	 * notice in the first line its public class car, but in 
	 * the instance variable we used private.
	 * 
	 * These access modifiers are used to tell who can change
	 * what. they grant permissions. Ill use another car anology:
	 * Public class is used because we want anyone to be able
	 * to buy a car. Anyone has our permission to go to the
	 * dealership. 
	 * Instance variable are different for ever instance 
	 * (every car). So if you buy a car, it has a color,
	 * and since you own the car, we want you to be able to 
	 * paint it. But we don't want anyone to be able to 
	 * paint it. We want your color instance to be private
	 * so only the owner can paint the car. 
	 */
	
	/*
	 * That isn't the only kind of variable we want to use 
	 * in our class. We also need to talk about class variables.
	 * Class Variables: these are used to save things that
	 * will be the same no matter the car. Its not a good
	 * idea to save the color here unless you want to sell 
	 * the same color car to everyone. But we aren't a motorcycle
	 * or semi dealer, so we know that all of our cars will have
	 * 4 wheels, so thats good to save here. This can't be
	 * changed once we own the car. Sure as humans we know cars
	 * get flat tires or wheels fall off, but for now, our 
	 * definition of a car has 4 wheels. 
	 */
	protected int wheels = 4;
	/*
	 * notice the word static, you have seen it before in the 
	 * main method call. This is the difference between a 
	 * instance variable and a class variable. 
	 * it means it can't change. 
	 */
	
	/*
	 * Constructors: Constructors are the primary basis of 
	 * objects. A constructor is just a method that can be called to 
	 * create a new object. Lets say you want a new car, this 
	 * is like going to the dealership to purchase one.
	 * At the dealership you can select the paint color, the 
	 * number of wheels, the model, the make etc. In the
	 * constructor, you select these characterists of your 
	 * object and then you now own it. (you can change 
	 * the color, make it drive, rack up the miles, etc)
	 */
	
	//to create a constructor, the method needs to be the same
	//as the class name:
	public Car(String color, int miles){
		
		//the primary goal of the constructor is to set the 
		//instance variables:
		this.color = color;
		this.miles = miles;
	}
	
	//getters, setters and printers
	
	public String getColor(){
		return color;
	}
	
	public int getMiles(){
		return miles;
	}
	
	public void printColor(){
		System.out.println("You own a " + color + " car");
	}
	
	public void printMiles(){
		System.out.println("This car has " + miles + " miles on it");
	}
	
	public void Drive(int miles){
		this.miles += miles;
	}
	
	public void Paint(String color){
		this.color = color;
		printColor();
		//System.out.println("You just painted your car " + getColor());
	}
	
	public static void main(String[] args){
		Car blueCar = new Car("Blue",108000);//we bought a used blue car
		Car redCar = new Car("Red",0); //we bought a brand new car
		
		blueCar.printMiles();
		blueCar.printColor();
		
		blueCar.Paint("Yellow");
	}
}
