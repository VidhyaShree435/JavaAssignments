package Assignment7;

public class Customer {
    
	private int custId;
	private String custName;
	private int accountNo;
	private double amount;
	
	public Customer(int custId,String custName,int accountNo,double amount) {
		this.custId = custId;
		this.custName = custName;
		this.accountNo = accountNo;
		this.amount = amount;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
