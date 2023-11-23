package Assignment7;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer[] customers = new Customer[10];
        
        for (int i = 0; i < 10; i++) {
        	customers[i] = new Customer(i + 1, "Customer" + (i + 1), 1000 + i, 5000.0);
        }
        
        for(Customer customer: customers) {
        	System.out.println("Customers ID :" + customer.getCustId());
        	System.out.println("Customer Name :"+customer.getCustName());
        	System.out.println("Account Number :"+customer.getAccountNo());
        	System.out.println("Amount: $"+customer.getAmount());
        }
        
           Bank myBank = new Bank(1, "MyBank", "City Center");
        
        System.out.println("Bank Number: "+ myBank.getBno());
        System.out.println("Bank Name: "+ myBank.getBname());
        System.out.println("Bank Locaiton: "+myBank.getLoc());
        
	}
	
}
