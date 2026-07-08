package p2;

public class BankAccount {
	int accno;
	double balance;

	public BankAccount() {
	}

	public BankAccount(int accno, double balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}

	public void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance;
	}

	public void withdraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
	}
}
