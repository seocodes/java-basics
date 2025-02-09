public class Search {
    public static void main(String[] args) {

        int[] numbers = {1, 9, 2, 7, 8, 3, 5, 4};
        int targetNum = 10;
        boolean isFoundNum = false;

        String[] fruits = {"apple", "orange", "banana"};
        String targetFruit = "orange";
        boolean isFoundFruit = false;

        for (int i = 0; i < numbers.length; i++) {
            if (targetNum == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFoundNum = true;
                break;
            }
        }
        if (!isFoundNum) {
            System.out.println("Element not found in the array.");
        }

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(targetFruit)) {
                System.out.println("Element found at index: " + i);
                isFoundFruit = true;
                break;
            }
        }

        if (!isFoundFruit) {
            System.out.println("Fruit wasn't found in the array.");
        }
    }
}
