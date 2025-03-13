import java.util.InputMismatchException;
import java.util.Scanner;

public class simple2 {
    public static void main(String[] args) {
        //Exception = An event that interrupts the normal flow of a program
        //Examples: (Dividing by zero, file not found, mismatch input type)
        //Surround any dangerous code with a try{} block
        // try{}, catch{}, finally{}

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("Should be a number, idiot");
        } catch (
                Exception e) {//not good practice to only use it, because the user wants to know whats wrong, if anything else fails, use this
            //it's a SAFETY NET
            System.out.println("Something went wrong.");
        } finally {  //always execute, whether there's an exception or not, usually used for cleaning up your program
            System.out.println("This always execute");  //just for testing purposes
        }


    }
}
