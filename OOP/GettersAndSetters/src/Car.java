public class Car {
    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        //In Java, when you use the + operator to concatenate a String (like "$") with a non-String value (like an int), Java automatically converts the non-String value into a String
        return "$" + this.price;
    }

    //No setModel cuz it's impossible to change a car model
    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if(price<0){
            System.out.println("Price can't be less than 0");
        }
        else{
            this.price =  price;
        }
    }
}

