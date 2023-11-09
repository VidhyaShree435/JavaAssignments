package Assignment;

public class CastAValue {

	 public static void main(String[] args) {
	        int intValue = 127; // Integer value
	        byte byteValue;

	        // Explicitly cast int to byte
	        byteValue = (byte) intValue;

	        System.out.println("Original int value: " + intValue);
	        System.out.println("Converted byte value: " + byteValue);
	    }
}
