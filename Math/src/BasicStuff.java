
public class BasicStuff {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;
        double z = 25;

        double max = Math.max(x, y);  //assigns the highest number to z
        double min = Math.min(x,y); //assigns the lowest number to min
        double abs = Math.abs(y); //makes it positive (absolute valuae)
        double square_root = Math.sqrt(z);
        double round = Math.round(x); //rounds in the more precise way (up or down)
        double roundUp = Math.ceil(x);
        double roundDown = Math.floor(x);

        System.out.println(max);
        System.out.println(min);
        System.out.println(abs);
        System.out.println(square_root);
        System.out.println(round);
        System.out.println(roundUp);
        System.out.println(roundDown);
    }
}