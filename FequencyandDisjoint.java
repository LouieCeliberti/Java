package intermediate;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FequencyandDisjoint {
	// Frequency is how may times that words is inn the list
	// Disjoint is if there are any similar words in the two list it will print false, otherwise true if there is nothing in common between the two list
	public static void main(String[] args) {

		String[] food = { "Pizza ", "Steak ", "Chicken ", "Sushi ", "Nachos " };
		List<String> list1 = Arrays.asList(food);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Dog ");
		list2.add("cat ");
		list2.add("lizard ");
		
		for (String c : list2){
			System.out.printf("%s", c);
		}
		
		Collections.addAll(list2, food);
		
		System.out.println();
		
		for (String c : list2){
			System.out.printf("%s", c);
	}
	System.out.println(Collections.frequency(list2, "Pizza"));
		
	System.out.println(Collections.disjoint(list1, list2));
	}
}