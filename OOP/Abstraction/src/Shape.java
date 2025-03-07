public abstract class Shape {

    //abstract method:
    abstract double area();

    //concrete methods:
    void display(){         //this one will be inherited automatically
        System.out.println("This a shape.");
    }
}
