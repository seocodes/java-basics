public class Scope {
    static int x = 3; //CLASS

    public static void main(String[] args) {
        int x = 1; //LOCAL
        doSomething(); //2
        System.out.println(x);  //1
    }

    static void doSomething(){
        int x = 2;  //LOCAL
        System.out.println(x);
    }
}

//JAVA USES LOCAL VARIABLES FIRST! IF THERE WEREN'T ANY, IT'D PRINT 3 (CLASS SCOPE).
