import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //do while loop = executes the block, then it checks if the condition remains true for the loop to continue

        Scanner sc = new Scanner(System.in);
        String name = "";

        do{
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        } while(name.isBlank());

        System.out.println("Hello " + name);
    }
}

