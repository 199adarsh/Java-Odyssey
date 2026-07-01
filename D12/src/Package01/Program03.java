package Package01;

// marker interface
interface I1 {

}

// functional interface
@FunctionalInterface
interface I2 {
	void m1(); // single abstract method (SAM)
}

interface I3 {
	void m1();

	void m2();
}

@FunctionalInterface
interface I4 {
	void m1(); // SAM

	default void m2() {

	}

	static void m3() {

	}
}

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
