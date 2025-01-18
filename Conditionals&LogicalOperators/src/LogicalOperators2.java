public class LogicalOperators2 {
    public static void main(String[] args) {
        int temp = 25;

        if (temp > 30){
            System.out.println("It's hot.");
        }
        else if (temp >= 20 && temp <= 30){
            System.out.println("It's warm.");
        }
        else{
            System.out.println("It's cold.");
        }
    }
}
