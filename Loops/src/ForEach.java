import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {

        // for-each = traversing technique to iterate through the elements in ana array/collection
        //            less steps, more readable
        //            less flexible

        //String[] animals = {"cat","dog","rat","bird"}
        ArrayList<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String animal : animals){  //animal is the "index" that increments
            System.out.println(animal);
        }
    }
}
