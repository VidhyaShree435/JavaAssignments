package Assignment13;

import java.util.Scanner;

public class ReverseString {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using a for loop
        String reversed = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed String: " + reversed);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse a string using a for loop
    private static String reverseString(String str) {
    	
        int length = str.length();
        StringBuilder reversedString = new StringBuilder();

        // Iterate through the string in reverse order
        for (int i = length - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }

        return reversedString.toString();
    }
}