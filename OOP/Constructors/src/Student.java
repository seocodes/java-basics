public class Student {

    // constructor = A special method to initialize objects
    //                         You can pass arguments to a constructor
    //                         and set up initial values

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;  // when creating student1 it'd be: student1.name = name ----> and the name is the parameter given
        this.age = age;    // same thing applies here and with student2
        this.gpa = gpa;
        this.isEnrolled = true;  // you can directly assign a value, it doesn't have to be a parameter all the time
    }

    void study(){
        System.out.printf("%s is studying\n", this.name);  // when printing with student3.study() it'd be "student3.name is studying"
    }
}
