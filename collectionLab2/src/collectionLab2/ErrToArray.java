package collectionLab2;

import java.util.Arrays;
import java.util.LinkedList;

public class ErrToArray {
	
	public ErrToArray() {
		String colors[] = { "black", "blue", "yellow", "red","green", "purple", "white"};
		LinkedList<String> links = new LinkedList<String>();
		
		links.add("white");
		links.add("red");
		links.add("blue");
		
		//colors= links.toArray(colors);
		
		System.arraycopy(links.toArray(new String[links.size()]), 0, colors, 0, links.size());

		for (String color : colors)
			System.out.println(color);
	}
	

	public static void main(String args[]) {
		new ErrToArray();
	} 

}
