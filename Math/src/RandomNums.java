import java.util.Random;

public class RandomNums {
    public static void main(String[] args) {
        Random random = new Random();
        //just to remember, they're not truly random, they're pseudorandoms

        int x = random.nextInt(); //no limits
        System.out.println(x);

        int y = random.nextInt(6); //0 to 5, you could put +1 to make it right
        System.out.println(y);

        double z = random.nextDouble();
        System.out.println(z);

        boolean bool = random.nextBoolean();
        System.out.println(bool);
    }
}
