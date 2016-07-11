package day6;

public class Dog extends Animal{
	public int numberOfLegs;
	
	public Dog(String ownersName, int numberOfLegs){
		super(ownersName);
		this.numberOfLegs = numberOfLegs;
	}
	
	public void move(){
		System.out.println("Dog is Running");
	}
	public void talk(){
		System.out.println("Bark");
	}
	
	public void eat(){
		System.out.println("Dog is eating food");
	}
	
	public void move(int numSteps){
		System.out.println("Dog moved " + numSteps + " forward");
	}
}
