package day2;

public class BankAccount {
	private int balance;
	
	/**
	 * Create a bank account without an initial deposit
	 */
	public BankAccount(){
		balance = 0;
	}
	
	/**
	 * Create a bank account with an initial deposit
	 * @param startBalance The starting balance of the bank account
	 */
	public BankAccount(int startBalance){
		balance = startBalance;
	}
	
	/**
	 * Deposit money in the bank account
	 * @param amount The amount to deposit into the bank account
	 */
	public void deposit(int amount){
		balance += amount;
	}
	
	/**
	 * Withdraw money from the bank account
	 * @param amount The amount to withdraw from the bank account
	 */
	public void withdraw(int amount){
		balance -= amount;
	}
	
	/**
	 * Gets the current balance of the bank account
	 * @return balance The current balance of the bank account
	 */
	public int getBalance(){
		return balance;
	}
	
	@Override
	public String toString(){
		return "This is a bank account with a balance of " +this.balance;
	}
	
	public static void main(String[] args){
		BankAccount bank = new BankAccount();
		System.out.println(bank.toString());
	}
}
