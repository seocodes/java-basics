public class Basics {
    public static void main(String[] args) {

        // printf()     =    an optional method to control, format and display text to the console window
        //                   two arguments = format string + object/variable/value
        //                   % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 100.0;

        // [conversion-character]
        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f",myDouble);

    }
}