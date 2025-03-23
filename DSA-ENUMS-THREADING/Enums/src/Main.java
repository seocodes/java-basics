import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class that
//                   represents a fixed set of constants.
//                   They improve code readability and reliability.
//                   More efficient with switches rather than comparing Strings.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        String response = sc.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is a weekend");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Enter a valid day.");
        }

        sc.close();
    }
}