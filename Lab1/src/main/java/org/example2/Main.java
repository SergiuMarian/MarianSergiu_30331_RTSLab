package org.example2;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        int[][] matrix1 = {
                {2, 3, 1},
                {7, 1, 6},
                {9, 2, 4}
        };

        matrix.setMatrix1(matrix1);

        int[][] matrix2 = {
                {8, 5, 3},
                {3, 9, 2},
                {2, 7, 3}
        };

        matrix.setMatrix2(matrix2);
        int [] [] sum = matrix.sum(matrix1, matrix2);

        int [][] product = matrix.product(matrix1, matrix2);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print(sum[row][col] + " ");

            }
            System.out.println();
        }

        System.out.println();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print(product[row][col] + " ");

            }
            System.out.println();
        }
    }
}
