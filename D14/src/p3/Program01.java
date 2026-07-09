package p3;

public class Program01 {

	public static void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(1001, 10000);

		class DepositThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					a1.deposit(1000);
					System.out.println("After deposit balance - " + a1.balance);
					delay();
				}
			}
		}

		DepositThread dt = new DepositThread();
		dt.start();

		class WithdrawThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					a1.withdraw(1000);
					System.out.println("After withdraw balance - " + a1.balance);
					delay();
				}
			}
		}

		WithdrawThread wt = new WithdrawThread();
		wt.start();

		try {
			dt.join();
			wt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final Balance : " + a1.balance);
	}
}
