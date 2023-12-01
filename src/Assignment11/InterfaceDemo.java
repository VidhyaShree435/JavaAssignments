package Assignment11;

interface trans
{
	public void desc();
	
	public void show();
}

interface customer extends trans
{
	public void showcustomer();
	
	public void showtrans();
	
}

class Bank implements customer{

	@Override
	public void desc() {
		// TODO Auto-generated method stub
		System.out.println("Tansaction description");
	}

	@Override
	public void show() {
 		// TODO Auto-generated method stub
		System.out.println("Show the transaction amount");
	}

	@Override
	public void showcustomer() {
		// TODO Auto-generated method stub
		System.out.println("Show the customer details");
	}

	@Override
	public void showtrans() {
		// TODO Auto-generated method stub
		System.out.println("Show the transaction details");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Bank obj = new Bank();
		
		obj.desc();
		obj.show();
		
		obj.showcustomer();
		obj.showtrans();
		
	}

}
