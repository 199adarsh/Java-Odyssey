package p1;

public class DeamonThread {

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
				for (int i = 1; i <= 7; i++) {
					System.out.println("MyThread : " + i);
					delay();
				}
			}
		}

		MyThread t1 = new MyThread();
		t1.start();// creates the thread and executes the run method

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
		t2.setDaemon(true);
		t2.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main : " + i);
			delay();
		}

	}

}
