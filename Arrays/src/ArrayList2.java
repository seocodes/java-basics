import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        /* ArrayList = a resizable array.
         *              elements can be added and removed after compilation phase
         *              STORES REFERENCE DATA TYPES ONLY (MAKES AUTOBOXING)!!!!!!!!
         *              Arrays are fixed in size, but ArrayLists can change  */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(0);
        list.add(9);

        list.set(1, 99);

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());

        Collections.sort(list);
        System.out.println(list);

        for(Integer number : list){
            System.out.println(number);
        }
    }
}
