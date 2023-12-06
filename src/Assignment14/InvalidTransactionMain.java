package Assignment14;

class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

class Account {
    private int validTransactionId = 100;

    public void processTransaction(int tranId) throws InvalidTransactionException {
        if (tranId != validTransactionId) {
            throw new InvalidTransactionException("Invalid transaction id!");
        }

        // Your transaction processing logic goes here
    }
}

// Example usage:
public class InvalidTransactionMain {
    public static void main(String[] args) {
        Account account = new Account();

        try {
            int tranId = 101; // Replace with the desired transaction id
            account.processTransaction(tranId);
        } catch (InvalidTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}