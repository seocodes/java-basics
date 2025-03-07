public class Person {
    // super = Refers to the parent class (subclass <- superclass)
    //               Used in constructors and method overriding
    //               Calls the parent constructor to initialize attributes

    String first;
    String last;


    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}
