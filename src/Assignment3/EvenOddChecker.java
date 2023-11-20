package Assignment3;

public class EvenOddChecker {
    
	private int number;
	
	public EvenOddChecker(int number) {
		this.number = number;
	}
	
	public String checkEvenOdd() {
		if(number%2==0) {
			return number+ " is even.";
		} else {
			return number+" is odd. ";
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberToCheck =15;
		
		EvenOddChecker checkerOject = new EvenOddChecker(numberToCheck);
		
		String result = checkerOject.checkEvenOdd();
		
		System.out.println(result);
          
	}

}
