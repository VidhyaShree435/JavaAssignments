package Assignment10;

abstract class Bank {
   int bno;
   String bname;
   String loc;
   
   abstract public void setVal(int b, String name,String l);
   
   public void displayAdditionalInfo() {
       // Implement this method in each subclass (Customer and Transaction)
       // to display additional information specific to each class.
   }
   
}

class Customer extends Bank {
	int custid;
	String cname;
	int acno;
	
	public void setVal(int b,String name, String l) {
		// TODO Auto-generated method stub
		
		this.bno = b;
		this.bname = name;
		this.loc = l;

	}
	
	@Override
    public void displayAdditionalInfo() {
        System.out.println("Customer ID: " + custid);
        System.out.println("Customer Name: " + cname);
        System.out.println("Account Number: " + acno);
    }
}

class Transaction extends Customer{
	
	int tran_id;
    String tran_desc;
	
	public void setVal(int b, String name, String l) {
		
		this.bno = b;
		this.bname = name;
		this.loc = l;
	}
	
	@Override
    public void displayAdditionalInfo() {
        System.out.println("Transaction ID: " + tran_id);
        System.out.println("Transaction Description: " + tran_desc);
    }
	
}
