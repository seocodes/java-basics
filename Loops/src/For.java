public class For {
    public static void main(String[] args) {
        //for loop = executes a block of code a limited amount of times

        for(int index = 10; index >= 0; index--){
            System.out.println(index);
        }
        System.out.println("Happy new year!");

        for(int index = 10; index >= 0; index-=2){ //decreases by 2 each iteration
            System.out.println(index);
        }

        for(int index = 10; index >= 0;){
            System.out.println(index);
            index-=2;  //the third statement can be inside the loop. it's the same as the above
        }
    }
}
