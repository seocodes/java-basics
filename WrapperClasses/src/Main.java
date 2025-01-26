public class Main {
    public static void main(String[] args) {
        /* wrapper class = provides a way to use primitive data types as reference data types
                        reference data types contain useful methods
                        can be used with collections  (ex: ArrayList)       */

        //note: reference data types are slower than primitive data types

        /* primitive      |     wrapper
        *  ---------------------------------
        *  boolean            Boolean
        *  char               Character
        *  int                Integer
        *  double             Double

        * OF COURSE THERE'S MORE, SUCH AS FLOAT, ETC*/

        //autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper class
        //unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive


        Boolean a = true;   //this all is autoboxing (assigning "true" to the reference data type Boolean, for example, cuz "true" is a primitive type boolean)
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Augusto";

        //UNBOXING
        if(a == true){  //variable a is behaving as a primitive type
            System.out.println("This is true.");
        }






    }
}