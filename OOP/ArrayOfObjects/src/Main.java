public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang","Red");
        Car car2 = new Car("Corvertte","Blue");
        Car car3 = new Car("Charger","Yellow");

        Car[] cars = {car1,car2,car3};  //Car[] cuz what's going to be inside the array is Car objects
//      Car[] cars = {new Car("Mustang", "Red"),
//                    new Car("Corvette", "Blue"),
//                    new Car("Charger", "Yellow")};

        for(Car car : cars){  //Not STRING cuz what's inside the array is an OBJECT
            car.color = "Black";
        }

        for(Car car : cars){  //Not STRING cuz what's inside the array is an OBJECT
            car.drive();
        }
    }
}