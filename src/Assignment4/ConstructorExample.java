package Assignment4;

class Home {
	
     private int var =10;
     
     public void showValue() {
    	 System.out.println("value of variable: "+ var);
     }
    
                                                                              //ctrl a+ ctrl i     //right click source, click getters and setters
	Home(){
		
		turnOnFan();
		turnOnLight();
		turnOnAC();
		showValue();
		
	}

	public void turnOnFan() {
		System.out.println("Turn on Fan");
	}

	public void turnOnLight() {
		System.out.println("Turn on Light");
	}

	public void turnOnAC() {
		System.out.println("Turn on AC");
	}

}

public class ConstructorExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Home obj = new Home();

	}
}