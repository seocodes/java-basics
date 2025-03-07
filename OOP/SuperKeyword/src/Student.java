public class Student extends Person{
    //this means students alr will have a first and last name and showName method

    double gpa;

    Student(String first, String last, double gpa){
        super(first,last);  //super refers to the parent, imagine we replace the super with "Person"
        //because student inherits from the Person class, so we have to pass these parameters to the Person class (superclass/parent class)
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }

}
