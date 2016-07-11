package day1;

public class VendingMachine {
	public int quarters;
	public int dimes;
	public int nickels;
	public int balance;
	
	public VendingMachine(int quarters, int dimes, int nickels){
		this.quarters = quarters;
		this.nickels = nickels;
		this.dimes = dimes;
		balance = 0;
	}
	
	public void insertQuarters(int n){
		quarters += n;
		balance += n*25;
	}

	public void insertDimes(int n){
		dimes = dimes + n;
		balance += n*10;
	}
	
	public void insertNickels(int n){
		nickels += n;
		balance += n*5;
	}
	
	public void purchase(int price){
		balance -= price;
		int changeQuarters = Math.min(quarters, balance/25);
		quarters -= changeQuarters;
		balance -= changeQuarters*25;
		
		int changeDimes = Math.min(dimes, balance/10);
		dimes -= changeDimes;
		balance -= changeDimes*10;
		
		int changeNickels = Math.min(nickels, balance/5);
		dimes -= changeNickels;
		balance -= changeNickels*5;
		
	}
	
	public int getQuarters(){
		return quarters;
	}
	
	public int getDimes(){
		return dimes;
	}
	
	public int getNickels(){
		return nickels;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public static void main(String[] args){
		VendingMachine vm = new VendingMachine(2,3,4);
		
		System.out.println(vm.getQuarters());
		vm.insertDimes(2);
		vm.insertNickels(6);
		System.out.println(vm.getDimes());
		System.out.println(vm.getNickels());
		System.out.println(vm.getBalance());
		vm.purchase(10);
		
		System.out.println(vm.getQuarters());
		System.out.println(vm.getDimes());
		System.out.println(vm.getNickels());
		
		System.out.println(vm.getBalance());
	}
}
