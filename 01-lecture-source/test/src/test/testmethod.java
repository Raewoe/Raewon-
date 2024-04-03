package test;

import java.util.Scanner;

public class testmethod {

    public static void main(String[] args) {


        int[][] arr  = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        /*arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;*/

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr.length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

        /*System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.print(arr[0][2] + " ");

        System.out.println();

        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");*/


    }
}



