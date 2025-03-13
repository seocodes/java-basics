import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many foods do u want? ");
        int num = sc.nextInt();
        sc.nextLine();

        String[] foods = new String[num];
        System.out.println(foods.length);

        for(int i = 0; i<foods.length; i++){
            System.out.println("Enter a food: ");
            String food = sc.nextLine();
            foods[i] = food;
        }

        for(String food : foods){
            System.out.println(food);
        }

        sc.close();
    }
}
