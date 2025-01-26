public class MultidArrayPT2 {
    public static void main(String[] args) {

        //2D array = an array of arrays

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Mustang";
        cars[0][2] = "Challenger";

        cars[1][0] = "Civic";
        cars[1][1] = "Corolla";
        cars[1][2] = "Accord";

        cars[2][0] = "Model S";
        cars[2][1] = "Model 3";
        cars[2][2] = "Model X";

        for (int i = 0; i < cars.length; i++) {  //index for the "row"
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {   //index for the "column"
                System.out.print(cars[i][j] + " ");   //prints cars[0][0], cars[0][1] and so go on till cars[2][2]
            }
        }
    }
}
