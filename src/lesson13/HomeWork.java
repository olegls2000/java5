package lesson13;

import java.util.ArrayList;
import java.util.Collections;

//1
public class HomeWork {
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Yellow");
		color.add("Orange");
		color.add("White");
		System.out.println(color);
		ArrayList<String> letter = new ArrayList<String>();
		letter.add("A");
		letter.add("B");
		letter.add("C");
		letter.add("D");
		letter.add("E");
		letter.add("F");

		Collections.copy(color, letter);// copy
		System.out.println(color);

		Collections.shuffle(color);
		System.out.println(color); // shuffle

		Collections.reverse(color);
		System.out.println(color); // reverse

		color.add(0, "Black");// at fist place
		System.out.println(color);

		color.add(2, "Rose");// specific index
		System.out.println(color);

		color.add(3, "Purple");// update element with specific value
		System.out.println(color);

		color.remove(3);
		System.out.println(color); // remove element

		if (color.contains("Black")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no this element"); // search by element
		}


		/*ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Petja", "Kolja", "Vasja"));
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));*/

	}


}
