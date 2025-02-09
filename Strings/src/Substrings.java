import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string
        //                         .substring(start, end)

        Scanner sc = new Scanner(System.in);

        String email;

        System.out.println("Enter your email: ");
        email = sc.nextLine();

        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));  //if we don't put anything in the end it'll go to the end

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Your email must have @ (domain).");
        }

        sc.close();
    }
}
