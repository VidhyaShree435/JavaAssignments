package Assignment16;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");     
		
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        
        System.out.println("Original String List: " + stringList);
        System.out.println("Original Integer List: "+ integerList);
		
     // Sort ArrayLists
        Collections.sort(stringList);
        Collections.sort(integerList);
        
     // Print sorted ArrayLists
        System.out.println("Sorted String List: " + stringList);
        System.out.println("Sorted Integer List: " + integerList);
       
     // Shuffle ArrayLists
        Collections.shuffle(stringList);
        Collections.shuffle(integerList);
        
        // Print shuffled ArrayLists
        System.out.println("Shuffled String List: " + stringList);
        System.out.println("Shuffled Integer List: " + integerList);
        
        
     // Add elements to ArrayLists
        stringList.add("Pineapple");
        integerList.add(10);
        
     // Print ArrayLists after adding elements
        System.out.println("String List after adding 'Pineapple': " + stringList);
        System.out.println("Integer List after adding 10: " + integerList);
        
     // Set elements in ArrayLists
        stringList.set(2, "Mango");
        integerList.set(1, 15);
        
     // Print ArrayLists after setting elements
        System.out.println("String List after setting index 2 to 'Mango': " + stringList);
        System.out.println("Integer List after setting index 1 to 15: " + integerList);

        
     // Remove elements from ArrayLists
        stringList.remove("Banana");
        integerList.remove(Integer.valueOf(8));
        
        // Print ArrayLists after removing elements
        System.out.println("String List after removing 'Banana': " + stringList);
        System.out.println("Integer List after removing 8: " + integerList);
        
        
     // Clear ArrayLists
        stringList.clear();
        integerList.clear();
        
        
        // Print ArrayLists after clearing
        System.out.println("String List after clearing: " + stringList);
        System.out.println("Integer List after clearing: " + integerList);
        
	}

}
