package collectionLab2;

import java.util.Vector;
import java.util.NoSuchElementException;

public class VectorTest {
	private static final String colors[] = { "red", "white", "blue" };

	public VectorTest() {
		Vector<String> vector = new Vector<>();
		printVector(vector);

		for (String color : colors) {
			vector.add(color);
		}

		printVector(vector);

		try {
			System.out.println("First element: " + vector.firstElement());
			System.out.println("Last Element: " + vector.lastElement());
		}

		catch (NoSuchElementException exception) {
			exception.printStackTrace();
		}

		if (vector.contains("red")) {
			System.out.println("red found at " + vector.indexOf("red"));
		} else {
			System.out.println("Red not found");
		}

		vector.remove("red");
		printVector(vector);

		if (vector.contains("red")) {
			System.out.println("red found at " + vector.indexOf("red"));
		} else {
			System.out.println("Red not found");
			System.out.println("size: " + vector.size());
			System.out.println("capacity: " + vector.capacity());
		}

	}

	private void printVector(Vector<String> vectorToOutput) {
		if (vectorToOutput.isEmpty()) {
			System.out.println("Vector is empty");
		} else {
			System.out.println("vector contains ");

			for (String element : vectorToOutput) {
				System.out.println(element);
			}
		}
	}

	public static void main(String args[]) {
		new VectorTest();
	}

}
