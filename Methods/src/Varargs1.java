public class Varargs1 {
    public static void main(String[] args) {

        // varargs = allow a method to accept a varying # of arguments
        //                  makes methods more flexible, no need for overloaded methods
        //                  java will pack the arguments into an array
        //                  ... (ellipsis)

        System.out.println(add(1,2,4,5));

    }

    static int add(int... numbers){  //we can passy any number of arguments (it'll become an array)
        int sum = 0;
        for(int number : numbers){  //iterate the array and sum
            sum += number;
        }
        return sum;
    }
}
