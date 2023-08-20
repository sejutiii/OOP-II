package collectionLab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
	
	private Character letters[]= {'P', 'C', 'M'};
	private Character[] lettersCopy;
	private List<Character> list;
	private List<Character> copyList;
	
	public Algorithms1()
	{
		list= Arrays.asList(letters);
		lettersCopy= new Character[3];
		
		copyList= Arrays.asList(lettersCopy);
		
		System.out.println("Initial List: ");
		output(list);
	}
	
