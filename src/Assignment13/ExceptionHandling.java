package Assignment13;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExceptionHandling {
	
    public static void main(String[] args) {
        // Arithmetic Example
        System.out.println("Arithmetic Example:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer for addition: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter another integer for subtraction: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Division with exception handling
        System.out.print("Enter a divisor for division: ");
        int divisor = scanner.nextInt();

        try {
            double quotient = (double) num1 / divisor;
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // Number Format Example
        System.out.println("\nNumber Format Example:");
        double formattedNumber = 1234567.89;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Currency Format: " + currencyFormat.format(formattedNumber));

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println("Percentage Format: " + percentFormat.format(formattedNumber));

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println("Number Format: " + numberFormat.format(formattedNumber));

        // Null Pointer Exception Example
        System.out.println("\nNull Pointer Exception Example:");

        System.out.print("Enter a string (or type 'null' for a null reference): ");
        String inputText = scanner.next();

        try {
            int length = inputText.length();
            System.out.println("Length of the input string: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}