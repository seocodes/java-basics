public class Main {
    public static void main(String[] args) {
        // overloaded constructors = Allow a class to have multiple constructors
        //                                                 with different parameter lists.
        //                                                 Enable objects to be initialized in various ways.

        User user1 = new User("Spongebob");
        User user2 = new User("Patrick","patrick@gmail.com");
        User user3 = new User("Sandy","scheeks@gmail.com",27);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}