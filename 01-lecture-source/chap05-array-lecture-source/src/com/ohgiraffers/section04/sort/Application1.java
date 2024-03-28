package com.ohgiraffers.section04.sort;

public class Application1 {

    public static void main(String[] args) {

        /* 변수의 두값을 변경하는 방법에 대해 이해할 수 있다.*/
        /* 변수의 두 값 변경하기 */

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        int[] arr = {1, 2, 3};
        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for (int i : arr) {
            System.out.print(i + " ");

        }


    }
}
