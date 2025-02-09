public class Precision {
    public static void main(String[] args) {

        // printf()     =    an optional method to control, format and display text to the console window
        //                   two arguments = format string + object/variable/value
        //                   % [flags] [.precision] [width] [conversion-character]

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.2f\n",price1); //precision
        System.out.printf("% .2f\n",price2); //the space before .2f occurs in the print too
        System.out.printf("% .2f",price3);
    }
}
