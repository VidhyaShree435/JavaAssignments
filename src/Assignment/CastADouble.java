package Assignment;

public class CastADouble {

    public static void main(String[] args) {
        double doubleValue = 3.14159; // Double value
        float floatValue;

        // Explicitly cast double to float
        floatValue = (float) doubleValue;

        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted float value: " + floatValue);
        
        
    }
}