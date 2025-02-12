public class Main {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
        //                         from another class.
        //                         Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        //Inheritance, extends from Organism
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        //Inheritance, extends from Animal
        dog.eat();
        cat.eat();
        plant.photosynthesize();

        dog.speak();
        cat.speak();
    }
}