package Assignment15;

public class ThreadExample {
	
    public static void main(String[] args) {
        // Creating thread t1
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread t1 is running");
                Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
                System.out.println("Thread t1 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Creating thread t2
        Thread t2 = new Thread(() -> {
            try {
                System.out.println("Thread t2 is running");
                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
                System.out.println("Thread t2 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Starting t1
        t1.start();

        try {
            // Joining t1 until it completes
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Starting t2 after t1 completes
        t2.start();

        try {
            // Joining t2 after it completes
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread continues here after t1 and t2 complete
        System.out.println("Main thread completes");
    }
}