package day1;

public class Truck extends Car{
	
	
	
	public Truck(String color, int miles){
		super(color,miles);
		super.wheels = 6;
	}
	
	public static void main(String[] args){
		Truck blueTruck = new Truck("blue", 0);
		System.out.println(blueTruck.wheels);
		Car blueCar = new Car("blue", 0);
		System.out.println(blueCar.wheels);
	}
	
	
}
