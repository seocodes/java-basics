import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        /* ArrayList = a resizable array.
        *              elements can be added and removed after compilation phase
        *              store reference data types ONLY!!!!!!!!  */

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");  // changes "pizza" to "sushi" - cause pizza is in index 0
        food.remove(2); // removes hotdog
        //food.clear(); //clear the entire list

        for (int i = 0; i < food.size(); i++){  // .size for ArrayList
            System.out.println(food.get(i));  //the method get literally gets the item by its index
        }



    }
}
