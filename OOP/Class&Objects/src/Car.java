public class Car {

        // Object = An entity that holds data (attributes)
        //                and can perform actions (methods)
        //                It is a reference data type

        // Class = Blueprint to create an object

        String make = "Ford";
        String model = "Mustang";
        int year = 2025;
        double price = 58000.99;
        boolean isRunning = false;

        void start(){
            System.out.println("You started the engine! Vrum vrum.");
            isRunning = true;
        }

        void stop(){
            System.out.println("You stopped the engine.");
            isRunning = false;
        }

        void drive(){
            System.out.printf("You are driving the %s\n", model);
        }

        void brake(){
            System.out.printf("You brake the %s\n", model);
        }
}