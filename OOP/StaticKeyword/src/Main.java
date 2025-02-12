public class Main {
    public static void main(String[] args) {
        // static = Modifies a variable or method belong to the class,
        //               rather than to any specific object.
        //               Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");
        System.out.println(friend1.numOfFriends);  //prints 1, not 2
        System.out.println(friend2.numOfFriends);  //cuz each object has its own "numOfFriends" counter, the variable belongs to the object, not the class
        System.out.println(Friend.numOfFriendsThatWorks); //you could call friend1.numOfFriendsThatWorks, but it's better to call the class cuz it shows that that variable is a static type
        Friend.showFriends();


        Math.round(3.99); //just to show "round" is a static type, we don't have to create and object from the Math class
    }
}