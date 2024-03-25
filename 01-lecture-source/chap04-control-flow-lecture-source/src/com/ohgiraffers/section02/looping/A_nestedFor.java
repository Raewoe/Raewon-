package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanForTwoTonice() {

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다. */
        /* for문안에 for문을 이용할 수 있다. */

        for(int dan = 2; dan <10; dan ++){

            for(int su = 1; su < 10; su++){
                System.out.println(dan + "*" + su + "=" + (dan*su));
            }
        }

    }
public  void orintStarInputRowTimes() {

    /* 키보드로 정수 하나를 입력받아 해당 정수만큼 한 행에 '*'을 5개씩 출력하세요 */

    Scanner sc = new Scanner(System.in);
    System.out.println("출력할 행 수를 입력하세요");
    int row = sc.nextInt();

    for (int i = 1; i <= row; i++) {

 //       for (int j = 1; j < 6; j++) {
  //          System.out.println("*");

        printStar(5);
        System.out.println();

        }
    }

    public void printStar(int times){

        for(int i = 1; i <= times; i++){
            System.out.print("*");
        }
    }

    public void printTriangleStars() {
        /*
        * 예시) 정수를 입력하세요 : 5
        *          *
        *          **
        *          ***
        *          ****
        *          *****
        *  */

        System.out.print("출력해 줄 수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {

            printStar(i);
            System.out.println();
        }
    }

}

