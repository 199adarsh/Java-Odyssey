package p1;

public class ThredingInterface {

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
					System.out.println("MyThread : " + i);
					delay();
				}
			}
		}

		MyThread t1 = new MyThread();
		t1.start();

		class MyRunnable implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("MyRunnable: " + i);
					delay();
				}
			}
		}

		Thread t2 = new Thread(new MyRunnable());
		t2.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main : " + i);
			delay();
		}

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Execution Finished");
	}

}
