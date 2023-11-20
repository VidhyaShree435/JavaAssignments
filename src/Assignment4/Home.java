package Assignment4;

public class Home {
    
	Home(){
		turnOnFan();
		turnOnLight();
		turnOnAC();
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Home obj = new Home();

	}

}
