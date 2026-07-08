package p1;

import java.util.Scanner;

public class ThredingState {

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
		System.out.println("State of t1 before start - " + t1.getState());
		t1.start();
		System.out.println("State of t1 after start - " + t1.getState());

		System.out.println("Press enter to check the t1 state ");
		new Scanner(System.in).nextLine();
		System.out.println("State of t1 in between - " + t1.getState());

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of t1 at the end- " + t1.getState());
	}

}
