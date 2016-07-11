package day6;

public abstract class Animal {
	public boolean isAPet = true;
	public String ownersName;
	
	
	public Animal(String ownerName){
		this.ownersName = ownerName;
	}
	
	public void sleep(){
		System.out.println("Sleeping");
	}
	
	public void eat(){
		System.out.println("Eating");
	}
	
	public abstract void move();
	
	public abstract void talk();
}
