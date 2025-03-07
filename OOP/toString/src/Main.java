import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // .toString() = Method inherited from the Object class.
        //                       Used to return a string representation of an object.
        //                       By default, it returns a hash code as a unique identifier.
        //                       It can be overridden to provide meaningful details.

        Car car = new Car("Ford","Mustang",2025,"Red");
        Car otherCar = new Car("Chevrolet","Corvette",2026,"Blue");

        System.out.println(car); //prints hash code of the object if there's no toString method override, but because it does,
        // it'll print object in form of String (check Car class)!!!!
        System.out.println(otherCar);
    }
}