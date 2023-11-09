package Assignment1;

public class Swap2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        int b = 10;

        // Print the original values
        System.out.println("Original values: a = " + a + ", b = " + b);

        // Swap the values using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Print the swapped values
        System.out.println("Swapped values: a = " + a + ", b = " + b);
	}

}
