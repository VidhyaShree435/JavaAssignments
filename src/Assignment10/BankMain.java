package Assignment10;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank[] records = new Bank[15];

        // Creating 5 Customer records
        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer();
            customer.setVal(i + 1, "Bank" + (i + 1), "Location" + (i + 1));
            customer.custid = i + 101;
            customer.cname = "CustName" + (i + 1);
            customer.acno = 1000 + i;
            records[i] = customer;
        }

        // Creating 5 Transaction records
        for (int i = 10 ; i < 15 ; i++) {
            Transaction transaction = new Transaction();
            transaction.setVal(i + 1, "Bank" + (i + 1), "Location" + (i + 1));
            transaction.tran_id = i + 201;
            transaction.tran_desc = "TransactionDesc" + (i + 1);
            records[i] = transaction;
        }

        // Displaying the records
        System.out.println("Bank Records:");
        for (Bank record : records) {
            System.out.println("Bank Number: " + record.bno);
            System.out.println("Bank Name: " + record.bname);
            System.out.println("Location: " + record.loc);

            // Assuming that setVal is common to both Customer and Transaction
            System.out.println("Additional Information:");
            record.displayAdditionalInfo(); // Call a method for additional info

            System.out.println(); // Adding a newline for better readability
        }
	}

}
