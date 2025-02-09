public class Ex1 {
    public static void main(String[] args) {


        //method = a block of code that is executed whenever it is called upon
        String name = "Bro";
        int age = 21;
        hello(name,age);

    }

    static void hello(String name, int age){
        System.out.println("Hello " + name + ", you're " + age + " years old");
    }
}