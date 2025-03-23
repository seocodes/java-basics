public class Main {
    public static void main(String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                                     Add custom behavior without having to create a new class.
        //                                     Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog = new Dog();
        //Anonymous class, really specific for just this object with custom behavior
        Dog talkingDog = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby doo goes *SALSICHA*");
            }
        };

        dog.speak();
        talkingDog.speak();
    }
}