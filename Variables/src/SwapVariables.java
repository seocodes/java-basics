public class SwapVariables {
    public static void main(String[] args) {
        String x = "water";
        String y = "Kool-Aid";
        String temp;
        //swapping variables with a temp var
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);

    }
}
