package Assignment8;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trans[] transactions = new Trans[10];

        // Populating the array with dummy data
        for (int i = 0; i < 10; i++) {
        	
            Trans transaction = new Trans();
            transaction.setBno(i + 1);
            transaction.setBname("Bank" + (i + 1));
            transaction.setLoc("Location" + (i + 1));
            transaction.setCustid(1000 + i);
            transaction.setCname("Customer" + (i + 1));
            transaction.setAcno(2000 + i);
            transaction.setTran_id(3000 + i);
            transaction.setTran_desc("Transaction" + (i + 1));

            transactions[i] = transaction;
        }

        // Customized for loop to print specific details
        for (Trans transaction : transactions) {
            System.out.println("Bank Name: " + transaction.getBname());
            System.out.println("Customer Name: " + transaction.getCname());
            System.out.println("Transaction Description: " + transaction.getTran_desc());
            System.out.println("------------------------");
        }
	}

}
