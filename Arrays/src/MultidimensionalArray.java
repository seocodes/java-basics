
public class MultidimensionalArray {
    public static void main(String[] args) {

        //2D array = an array of arrays

        String[][] cars = {
                {"Camaro","Corvette","Silverado"},
                {"Mustang","Ranger","F-150"},
                {"Ferrari","Lamborghini","Tesla"}
        };

        for(int i = 0; i < cars.length; i++){  //index for the "row"
            System.out.println();
            for(int j = 0; j < cars[i].length; j++){ //index for the "column"
                System.out.print(cars[i][j] + ", ");    //prints cars[0][0], cars[0][1] and so go on till cars[2][2]
            }
        }
    }
}
