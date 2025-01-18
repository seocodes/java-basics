import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        logical operators = used to connect two or more expressions
                && (AND) - both conditions must be true
                || (OR) - either condition must be true
                ! (NOT) - reverses boolean value of a condition
         */

        Scanner sc = new Scanner(System.in);
        //the if statement is hard on purpose, just to show that if u use "!", you change || for && or vice versa
        while (true) {
            System.out.println("You are playing a game! Press Q to quit!");
            String response = sc.next();

            //if I don't type "q" or don't type "Q", the game will keep going
            if (!response.equals("q") && !response.equals("Q")) {
                //not using || cuz if u type "q", "Q" response will not be identified (OR condition would be true) so the game would keep going
                System.out.println("You are still playing the game! *pew pew*");
            } else {
                System.out.println("You quit!");
                break;
            }
            /*
            NORMAL WAY:
            if (response.equals("q") || response.equals("Q")) {]
                System.out.println("You quit!");
                break;
            } else {
                System.out.println("You are still playing the game! *pew pew*");
            }
             */
        }
    }
}

