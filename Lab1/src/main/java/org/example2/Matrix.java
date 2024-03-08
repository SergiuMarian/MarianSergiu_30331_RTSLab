package org.example2;
import java.util.Arrays;
public class Matrix {
    private int matrix1[][] = new int[3][3];
    private int matrix2[][] = new int[3][3];

    public int[][] getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    public int[][] sum(int[][] matrix1, int[][] matrix2){

        int result[][] = new int[3][3];

        for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < 3; col++) {

                result[row][col] = matrix1[row][col] + matrix2[row][col];

            }

        }
        return result;
    }

    public int[][] product(int[][] matrix1, int[][] matrix2) {

        int result[][] = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                int summ = 0;

                for (int i = 0 ; i < 3 ; i++){

                    summ +=matrix1[row][i] * matrix2[i][col];
                }
                result[row][col] = summ;

            }



        }
        return result;
    }

}
