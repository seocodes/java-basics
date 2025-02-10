import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Object = An entity that holds data (attributes)
        //                and can perform actions (methods)
        //                It is a reference data type

        // Class = Blueprint to create an object

        Scanner sc = new Scanner(System.in);
        Random random =  new Random();

        Car car1 = new Car();
        Car car2 = new Car();  //it's the same, but in EX2 we'll see about constructors

//        car1.isRunning = true;  //Changed the attribute, simple like that

        car1.drive();
        car1.brake();

        System.out.println(car1.isRunning);
        car1.start();
        System.out.println(car1.isRunning);
        car1.stop();
        System.out.println(car1.isRunning);
        System.out.println("---------");

        System.out.println(car1); //Prints memory address cuz it's a reference data type
        System.out.println(car1.model);
        System.out.println(car1.make);
        // we could print everything else here

    }
}
