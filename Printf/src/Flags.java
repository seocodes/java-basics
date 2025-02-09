public class Flags {
    public static void main(String[] args) {
        double price1 = 9.99;
        double price2 = 10000.15;
        double price3 = -54.01;

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price2); //good for prices
        System.out.printf("%(f\n", price3);  //+ doesnt work here
    }
}
