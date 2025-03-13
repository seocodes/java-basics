import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        /* ArrayList = a resizable array.
        *              elements can be added and removed after compilation phase
        *              STORES REFERENCE DATA TYPES ONLY (MAKES AUTOBOXING)!!!!!!!!
        *              Arrays are fixed in size, but ArrayLists can change  */

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
