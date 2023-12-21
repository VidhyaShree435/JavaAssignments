package Assignment18;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Use Iterator to iterate through the String list
        System.out.println("String List:");
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        // Create a LinkedList with Integer values
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        // Use Iterator to iterate through the Integer list
        System.out.println("\nInteger List:");
        Iterator<Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        // Add an element to the String list
        stringList.add("Grapes");
        System.out.println("\nString List after adding 'Grapes':");
        stringList.forEach(System.out::println);

        // Set an element in the Integer list
        integerList.set(1, 25);
        System.out.println("\nInteger List after setting the second element to 25:");
        integerList.forEach(System.out::println);

        // Remove an element from the String list
        stringList.remove("Banana");
        System.out.println("\nString List after removing 'Banana':");
        stringList.forEach(System.out::println);

        // Clear the Integer list
        integerList.clear();
        System.out.println("\nInteger List after clearing:");
        integerList.forEach(System.out::println);
	}

}
