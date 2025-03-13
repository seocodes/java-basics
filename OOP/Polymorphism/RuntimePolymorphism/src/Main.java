import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Runtime polymorphism = When the method that gets executed is decided
        //                                               at runtime based on the actual type of the object.

        Scanner sc = new Scanner(System.in);

        Animal animal;

        System.out.print("Pick: CAT (1) or DOG (2): ");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new Cat();
            animal.speak();
        }
        else if (choice == 2){
            animal = new Dog();
            animal.speak();
        }
    }
}