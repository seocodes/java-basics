import java.util.Scanner;

public class NestedLoops_MATRIX {
    public static void main(String[] args) {
        //nested loops = a loop inside a loop

        //this file will make a matrix!
        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = sc.nextInt();

        System.out.println("Enter # of columns: ");
        columns = sc.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = sc.next();   //remember, sc.next() cuz it's just a symbol, if it's a phrase (like "I love you"), use nextLine()

        for(int i = 1; i <= rows; i++){  //first iteration will occur when i = 1. This is typical when counting rows or items starting from 1, as many human-readable formats
            System.out.println(); //this will move to the next row
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
