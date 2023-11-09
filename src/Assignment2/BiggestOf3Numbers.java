package Assignment2;

import java.util.Scanner;

public class BiggestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number among the three
       if(num1>num2 && num1>num3) {
    	   System.out.println("The largest number is: " + num1);
       }
       else if(num2>num1 && num2>num3) {
    	   System.out.println("The largest number is: " + num2);
       }
       else if(num3>num1 && num3>num2) {
    	   System.out.println("The largest number is: " + num3);
       }
       else {
        System.out.println("All integer is larger" );
       }
        // Close the scanner
        scanner.close();
	}

}