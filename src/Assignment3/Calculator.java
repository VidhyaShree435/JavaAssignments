package Assignment3;

public class Calculator {
	
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {  //parameters 
		this.num1=num2;
		this.num2=num2;
	}
	
	public int calculateSum() {
		return num1+num2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Calculator calculator1= new Calculator(5,10);
          Calculator calculator2=new Calculator(8,3);
         
          int result1 = calculator1.calculateSum();
          int result2 = calculator2.calculateSum();
          
		  System.out.println("Sum of Calculator1: "+ result1);
		  System.out.println("Sum of Calculator2: "+result2);
		  
	}

}
