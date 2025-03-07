public class Main {
    public static void main(String[] args) {
        // Polymorphism = "POLY-" = "MANY"
        //                               "-MORPH" = "SHAPE"
        //                               Objects can identify as other objects.  --ex: dog can be a dog, animal, organism or even an object
        //                               Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}