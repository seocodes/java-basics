public class Friend {
    // static = Modifies a variable or method belong to the class,
    //               rather than to any specific object.
    //               Commonly used for utility methods or shared resources.

    int numOfFriends;
    static int numOfFriendsThatWorks;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
        numOfFriendsThatWorks++;
    }

    static void showFriends(){
        System.out.printf("You have %d friends",numOfFriendsThatWorks); //we don't need to put this.numOfWhatever cuz it's a static,
                                                                        // belongs to the class, there's no object to put "this"
    }
}
