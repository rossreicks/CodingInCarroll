package day6;

public class Cat extends Animal{
	public Cat(String ownerName){
		super(ownerName);
	}
	
	public void move(){
		System.out.println("Cat is prancing");
	}
	
	public void talk(){
		System.out.println("Meow");
	}
}
