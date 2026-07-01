package p1;

public class Program01 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// display square of all even numbers
		for (Integer e : arr) {
			if (e % 2 == 0)// operation 1 : To check for even number (check the condition use filter)
			{
				int sq = e * e;// operation 2: Calculate the square of a number (To perform operation on
								// elements use map)
				System.out.println("Square - " + sq); // operation 3 : display the result
			}
		}
	}

}
