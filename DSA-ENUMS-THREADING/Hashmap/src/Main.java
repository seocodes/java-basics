import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs
        //                      Keys are unique, but Values can be duplicated
        //                      Does not maintain any order, but is memory efficient
        //                      HashMap<Key, Value>

        //String = key | Double = value
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple",0.99);
        map.put("orange",1.25);
        map.put("banana",0.50);
        //cannot have duplicate keys, it will override the 1.25 value to 100000.00
        //map.put("orange",100000.00);

        map.remove("apple");

        System.out.println(map);  //prints in curly braces
        System.out.println(map.get("banana"));  //gets the value

        //returns boolean
        System.out.println(map.containsKey("orange"));
        System.out.println(map.containsValue(0.50));

        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        }
        else{
            System.out.println("Key not found.");
        }

        System.out.println(map.size());

        for(String key : map.keySet()){  //gets the set of keys, iterable
            System.out.println(key + ": $"+map.get(key));
        }





    }
}