package collectionLab2;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort1 {
	private static final String suits[]= { "hearts", "Diamonds", "Clubs", "Spades"};
	
	public void printElements() {
		List<String> list = Arrays.asList(suits);
		System.out.println("Unsorted array elements "+ list);
		
		Collections.sort(list);
		
		System.out.println("Sorted array elements: "+ list);
	}
	
	public static void main(String args[])
	{
		Sort1 sort1= new Sort1();
		sort1.printElements();
	}
}
