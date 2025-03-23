public class Main {
    public static void main(String[] args) {
        // Multithreading = Enables a program to run multiple threads concurrently
        //                               (Thread = A set of instructions that run independently)
        //                               Useful for background tasks or time-consuming operations

        Thread thread1 = new Thread(new MyRunnable("PING")); //instead of creating an instance of MyRunnable and attributing, we're doing it directly
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("Game start!");

        //Multithreading
        thread1.start();
        thread2.start();

        try {
            //before we print game over, we're gonna wait to the 2 threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread stopped working");
        }

        System.out.println("Game over!");

    }
}