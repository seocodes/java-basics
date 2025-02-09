import java.sql.SQLOutput;

public class TernaryOperator {
    public static void main(String[] args) {
        // variable = (condition) ? IfTrue : IfFalse;

        int score = 75;
        int number = 10;
        int hours = 13;
        int income = 60000;

        String passOrFail = (score >= 70) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        String timeOfDay = (hours < 12) ? "A.M." : "P.M";
        System.out.println(timeOfDay);

        double taxRate = (income > 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
