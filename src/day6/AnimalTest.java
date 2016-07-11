package day6;

import imports.Printer;

import java.util.ArrayList;

public class AnimalTest extends Printer{
	public static void main(String[] args){
		Dog dog = new Dog("Ross", 4);
		
		System.out.println(dog.isAPet);
		dog.eat();
		
		Cat cat = new Cat("Ross");
		
		cat.talk();
		dog.talk();
		
		cat.eat();
		
		dog.eat();
		
		dog.move();
		
		dog.move(12);
		
		Animal[] arr;
		
		Animal an = new Dog("Ross",4);
		
		Animal ca = new Cat("Matt");
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(an);
		
		list.add(ca);
		
		Print(list.get(0).ownersName);
		
		
	}
}
