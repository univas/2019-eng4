package br.edu.univas;

public class App {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(190, "João", "0928-1", 100, 1.99);
		
		BankAccount account2 = new BankAccount(199, "Maria", null, 2983, 0.88);
		
		System.out.println("Account 1:");
		System.out.println(account1);
		
		System.out.println("\n\nAccount 2:");
		System.out.println(account2);
	}
}
