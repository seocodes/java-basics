import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args){
        double x;
        double y;
        double hypotenuse;

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER SIDE X: ");
        x = sc.nextDouble();
        System.out.println("ENTER SIDE Y: ");
        y = sc.nextDouble();

        hypotenuse = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+hypotenuse);

        sc.close(); //good practice
    }
}
