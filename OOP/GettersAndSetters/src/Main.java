public class Main {
    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or modifying them
        //Getter: A method that returns the value of a private attribute.
        //Setter: A method that sets or modifies the value of a private attribute.

        Car car = new Car("Charger","Yellow",10000);

    //      IMPOSSIBLE CUZ IT'S PRIVATE
        //      car.model = "Corvette"
    //        System.out.println(car.model);

        car.setColor("blue");
        car.setPrice(50000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}