public class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){   //we HAVE to either implement this method from Shape (cuz it's an abstract method) or make the class abstract
        return Math.PI * radius * radius;
    }
}
