import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements
        //                                   (Java14 feature)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = sc.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday 😩");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend 😀");
            default -> System.out.println(day + " is not a day");
        }

        sc.close();
    }
}
