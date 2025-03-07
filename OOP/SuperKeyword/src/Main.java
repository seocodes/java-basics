public class Main {
    public static void main(String[] args) {
        // super = Refers to the parent class (subclass <- superclass)
        //               Used in constructors and method overriding
        //               Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 4.5);
        Employee employee = new Employee("Rubeus","Hagrid",15000);

        person.showName();

        student.showName();
        student.showGpa();

        employee.showSalary();
        employee.showName();
    }
}