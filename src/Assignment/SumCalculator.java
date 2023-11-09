package Assignment;

import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum without using a separate method
        int sum = num1 + num2;

        // Print the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
        
    }
}

