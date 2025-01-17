import java.util.Scanner;

public class Hipotenuse {
    public static void main(String[] args){
        double x;
        double y;
        double hipotenuse;

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER SIDE X: ");
        x = sc.nextDouble();
        System.out.println("ENTER SIDE Y: ");
        y = sc.nextDouble();

        hipotenuse = Math.sqrt((x*x)+(y*y));

        System.out.println("The hipotenuse is: "+hipotenuse);

        sc.close(); //good practice
    }
}
