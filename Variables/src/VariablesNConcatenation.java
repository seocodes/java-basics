public class VariablesNConcatenation {
    public static void main(String[] args) {
        int x = 123; //initialization

        int y; //declaration
        y = 456; //assignment

        System.out.println(x);
        System.out.println(y);
        System.out.println("My number is: " + x); //concatenation

        long n = 312809473298503853L;
        System.out.println(n);

        float i = 3.14f;
        System.out.println(i);

        double j = 3.14;
        System.out.println(j);

        boolean z = true;
        System.out.println(z);

        char symbol = '@';
        System.out.println(symbol);

        String name = "Bro"; //has to be double quotes
        System.out.println("Hello, "+name);

    }
}