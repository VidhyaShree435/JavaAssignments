package Assignment16;

import java.util.ArrayList;

public class ArrayListForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList = new ArrayList<>();
        // Add elements to ArrayList using a for loop
        for (int i = 1; i <= 5; i++) {
            stringList.add("Element " + i);
        }

        // Print original String List
        System.out.println("Original String List: " + stringList);

        // Use a for loop to set elements at specific indices
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, "Updated " + stringList.get(i));
        }

        // Print String List after setting elements
        System.out.println("String List after setting elements: " + stringList);

        // Use a for loop to remove elements based on a condition
        for (int i = stringList.size() - 1; i >= 0; i--) {
            if (stringList.get(i).contains("Updated")) {
                stringList.remove(i);
            }
        }

        // Print String List after removing elements
        System.out.println("String List after removing elements: " + stringList);

        // Create ArrayList with Integer values
        ArrayList<Integer> integerList = new ArrayList<>();
        // Add elements to ArrayList using a for loop
        for (int i = 1; i <= 5; i++) {
            integerList.add(i * 2);
        }

        // Print original Integer List
        System.out.println("Original Integer List: " + integerList);

        // Use a for loop to double the values of elements
        for (int i = 0; i < integerList.size(); i++) {
            integerList.set(i, integerList.get(i) * 2);
        }

        // Print Integer List after doubling the values
        System.out.println("Integer List after doubling values: " + integerList);
  
	}

}
