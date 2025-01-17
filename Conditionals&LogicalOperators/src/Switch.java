public class Switch {
    public static void main(String[] args) {
        //switch = statement that allows a variable to be tested for equality against a list of values/cases

        String day = "Pizza";

        switch(day){
            case "Sunday": System.out.println("It is Sunday!");
            break;  //used to not perform all other actions after the equality is found
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            default: System.out.println("Not a valid day.");  //if there's no match, default will happen
            break;

        }
    }
}
