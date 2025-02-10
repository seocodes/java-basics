public class Car {

    String model;
    String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.printf("You're driving a %s %s\n",this.color,this.model);
    }
}
