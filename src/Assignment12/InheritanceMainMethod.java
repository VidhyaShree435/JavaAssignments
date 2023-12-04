package Assignment12;

class Vehicle{
	
	String brand;
	
	Vehicle(String brand){
		this.brand = brand;
	}
	
	void start() {
		System.out.println(brand + " is starting.");
	}
	
	void stop() {
		System.out.println(brand + " is stoping.");
	}
	
}

class Car extends Vehicle{
	
	Car(String brand){
		
		super(brand);
		
	}
	
	void accelerate() {
		System.out.println(brand+" is accelerating.");
	}
	
}

class Motorcycle extends Vehicle {
	
    Motorcycle(String brand) {
        // Call the constructor of the superclass (Vehicle)
        super(brand);
    }

    // Additional method specific to Motorcycle
    void wheelie() {
        System.out.println(brand + " is doing a wheelie.");
    }
}

public class InheritanceMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		Car myCar = new Car("Toyota");
		Motorcycle myMotor = new Motorcycle("Harley-Davidson");
		
		myCar.start();
		myCar.stop();
		
		myMotor.start();
		myMotor.stop();
		
		myCar.accelerate();
		myMotor.wheelie();
		
	}

}
