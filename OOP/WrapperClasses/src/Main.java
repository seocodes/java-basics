public class Main {
    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                                   to be used as objects. "Wrap them in an object"
        //                                   Generally, don't wrap primitives unless you need an object.
        //                                   Allows use of Collections Framework and static utility methods.


        //AUTOBOXING
//       Integer a = new Integer(123);  - THAT'S WHAT WE'RE DOING BASICALLY
        Integer a = 123;

//       Double b = new Double(3.14);
        Double b = 3.14;

//       Character c = new Character("$");
        Character c = '$';

//        Boolean d = new Boolean(true);
        Boolean d = true;


        //UNBOXING
//        int x = a;
//        double y = b;
//        char z = c;
//        boolean l = d;


        //Wrapper Classes have the toString methods and another useful methods
        //all wrapper classes are reference data types, but not all reference data types are wrapper classes.
        String w = Integer.toString(123);
        String x = Double.toString(3.14);
        String y = Character.toString('%');
        String z = Boolean.toString(false);

        String message = w + x + y + z;
        System.out.println(message);

        //PARSING
        int a1 = Integer.parseInt("123");
        double b1 = Double.parseDouble("3.14");
        char c1 = "Pizza".charAt(0); //CHARACTER DOESNT HAVE A PARSING METHOD
        boolean d1 = Boolean.parseBoolean("true");

        //Some other cool methods:
        char letter = 'b';
        System.out.println(Character.isLetter(letter)); //Just using a wrapper class method, not creating an object here
        System.out.println(Character.isUpperCase(letter));
    }
}