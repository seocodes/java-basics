public class simple {
    public static void main(String[] args) {

        //Exception = An event that interrupts the normal flow of a program
        //Examples: (Dividing by zero, file not found, mismatch input type)
        //Surround any dangerous code with a try{} block
        // try{}, catch{}, finally{}

    try{  //Any code that's dangerous, that might cause an exception, you can surround in a try block, the example "simple2" makes it easier to understand
        System.out.println(1/0);
    } catch (ArithmeticException e) {
        System.out.println("Can't divide by zero");
    }

    }
}