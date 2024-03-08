package org.example3;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int random_number = 0;
        Random random = new Random();
        int []array = new int[10];
        int aux = 0;

        for (int i = 0; i < 10; i++){
            random_number = random.nextInt(1,100);
            array[i] = random_number;
            System.out.println(array[i]);
        }
        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;


                }
            }
        }

        System.out.println();
        for ( int i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }
}
