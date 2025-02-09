public class Ex2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        int z = sum(x,y);   //We can use "int z" here as well because it's a local variable (only recognized within the main method)
        System.out.println(z);
        //System.out.println(sum(x,y);   <---   Another way to print it

    }

    static int sum(int num1, int num2){   //Not void cuz we are returning something
        int z = num1+num2;
        return z;
        //return num1+num2 is also viable
    }
}
