package br.edu.univas;

public class BankAccount {

	private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;
    
	public BankAccount(long accountNumber, String owner, String branch, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.branch = branch;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
    
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Account Number = ").append(accountNumber).append("\n");
		result.append("Owner = ").append(owner).append("\n");
		result.append("Branch = ").append(branch).append("\n");
		result.append("Balance = ").append(balance).append("\n");
		result.append("Interest Rate = ").append(interestRate);
		return result.toString();
	}
	
}
