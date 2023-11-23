package StringsDemo;

public class StringLengthUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String yourString = "YourStringHere";
		
		//initialize variable
		int length = 0;
		int index = 0;
		
		while(length < yourString.length()) {
			
		// Increment the length for each character
			length ++ ;
			
		//Move to the next character	
			index ++;
		}
		
		System.out.println("Length of the String : "+ length);
		
	}

}
