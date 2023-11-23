package StringsDemo;

public class DeleteCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yourString = "YourStringHere";
		// Replace 'X' with the character you want to delete
		char charToDelete = 'X';
		// Find the index of the character to delete
		int indexToDelete = yourString.indexOf(charToDelete);
		// Check if the character is found in the string
		if(indexToDelete != -1) {
			// Create a new string by excluding the character to delete
			String modifiedString = yourString.substring(0, indexToDelete) + yourString.substring(1, indexToDelete);
			// Print the original and modified strings
			System.out.println("Orginal String :"+ yourString );
			System.out.println("Modified String :"+ modifiedString);
			
		} else {
			
			System.out.println("Character '"+ charToDelete + " ' Not found in the string.");
			
		}
	}

}
