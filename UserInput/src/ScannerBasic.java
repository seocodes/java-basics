import java.util.Scanner; //imports scanner class (self explanatory)

 class ScannerBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner

        System.out.println("What is your name?");
        String name = scanner.nextLine();   //read user input

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); //clears the \n that remained after nextInt (cuz nextInt just read the numeric portion)

        System.out.println("Your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello, "+name+", you are "+age+" years old");
        System.out.println("You like "+food);

    }
}