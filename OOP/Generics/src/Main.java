public class Main {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface, or method
//                     that is compatible with different data types.
//                    <T> type parameter (placeholder that gets replaced with a real type)
//                    <String> type argument (specifies the type)

        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        box1.setItem("banana");
        box2.setItem(3);

        System.out.println(box1.getItem());
        System.out.println(box2.getItem());

        Product<String, Double> product = new Product<>("apple",3.99);
        System.out.println(product.getItem() + " " + product.getPrice());

    }
}