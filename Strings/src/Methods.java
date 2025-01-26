public class Methods {
    public static void main(String[] args) {
         //String = a reference data type that can store on or more characters
        // REFERENCE DATA TYPES HAVA ACCESS TO USEFUL METHODS

        String name = "Bro";

        boolean result = name.equalsIgnoreCase("bro");
        System.out.println(result);

        int length = name.length();
        System.out.println(length);

        char charByIndex = name.charAt(0);
        System.out.println(charByIndex);

        int indexByChar = name.indexOf("o");
        System.out.println(indexByChar);

        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String lower = name.toLowerCase();
        System.out.println(lower);

        String trimmed = name.trim();  //trim if there's empty space, like ("          BRO               ")
        System.out.println(trimmed);

        String nameReplace = name.replace('o','a');
        System.out.println(nameReplace);

    }
}