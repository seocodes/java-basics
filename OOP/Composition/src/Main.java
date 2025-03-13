public class Main {
    public static void main(String[] args) {
        // Composition = Represents a "part-of" relationship between objects.
        //                            For example, an Engine is "part of" a Car.
        //                            Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette",2025,"V8");

        System.out.println(car.engine); //prints the object hash id
        System.out.println(car.engine.type); //gets the object Engine and uses its method

        car.start();
    }
}