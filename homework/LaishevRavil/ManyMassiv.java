package homework.LaishevRavil;

/**
 * Created by User on 17.03.2017.
 */
public class ManyMassiv {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},
                           {4,5},
                           {7,8,9,10,11}};
        for (int i = 0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}