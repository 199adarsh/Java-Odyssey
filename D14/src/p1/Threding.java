package p1;

public class Threding {

	public static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		class MyThread extends Thread {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("MyThread Task-1 : " + i);
					delay();
				}
			}
		}

		MyThread t1 = new MyThread();
		t1.start(); // creates the thread and executes the run method

		class MyRunnable implements Runnable {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("MyRunnable Task-2 : " + i);
					delay();
				}
			}
		}
		// Anonymous Object
		Thread t2 = new Thread(new MyRunnable());
		t2.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Task-3 : " + i);
			delay();
		}
	}
}
