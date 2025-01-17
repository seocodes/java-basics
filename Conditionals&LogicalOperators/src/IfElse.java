public class IfElse {
    public static void main(String[] args) {
        //if statements = performs a block of code if it's conditions evaluates to be true
        //else = performs a block of code if the other conditions aren't evaluated to be true

        int age = 18;

        if(age >= 18){
            System.out.println("You're an adult!");
        }
        else if(age == 75){
            System.out.println("You're becoming a boomer...");
        }
        else if(age >= 13){
            System.out.println("You're a teenager!");
        }
        else{
            System.out.println("You're a minor!");
        }
    }
}