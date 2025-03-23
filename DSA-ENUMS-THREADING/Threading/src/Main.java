import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously
        //                       Helps improve performance with time-consuming operations
        //                      (File I/O, network communications, or any background tasks)

        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        Scanner sc = new Scanner(System.in);

        MyRunnable countdown = new MyRunnable(); //encapsulate the logic in the MyRunnable class for organization and reusability, we could make the for loop just with a new Thread(), but it's way better this way
        Thread thread = new Thread(countdown);
        thread.setDaemon(true);  //if the main thread ends, this thread will also end
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.println("Enter your name: ");

        String name = sc.nextLine();
        System.out.println("Hello "+name);

        sc.close();

    }
}