package Assignment13;

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Handling ArithmeticException
            int result = divideNumbers(10, 0);
            System.out.println("Result of division: " + result);

            // Handling NumberFormatException
            String numberInput = getNumberInput(scanner);
            int parsedNumber = parseNumber(numberInput);
            System.out.println("Parsed Number: " + parsedNumber);

            // Handling NullPointerException
            String str = null;
            printStringLength(str);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        } finally {
            // Close resources, if needed
            scanner.close();
        }
    }

    // Method causing ArithmeticException
    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }

    // Method causing NumberFormatException
    private static String getNumberInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.next();
    }

    // Method causing NullPointerException
    private static void printStringLength(String str) {
        System.out.println("Length of the string: " + str.length());
    }

    // Method causing NumberFormatException
    private static int parseNumber(String numberInput) {
        return Integer.parseInt(numberInput);
    }
}