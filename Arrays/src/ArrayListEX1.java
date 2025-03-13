import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.println("# of foods: ");
        int numOfFood = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<numOfFood; i++){
            System.out.println("Enter food #"+i);
            String food = sc.nextLine();
            foods.add(food);
        }

        for(String food : foods){
            System.out.println(food);
        }

        sc.close();
    }
}
