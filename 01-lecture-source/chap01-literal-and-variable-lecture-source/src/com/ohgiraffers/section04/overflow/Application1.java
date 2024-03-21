package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args){

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 자료형의 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림 처리하고 sign bit를 반전시켜 최소값으로 순환시킴 */

        /* 1. 오버플로우 */

        byte num1 = 127;

        System.out.print("num1 : " + num1);

        num1++;                    //1이 증가

        System.out.print("num1 오버플로우 : " + num1);

        /* 2. 언더플로어 */
        /* 오버플로우와 반대의 개념으로 최소 범위보다 작은 수를 발생기키는 경우 발생하는 현상이다. */

        byte num2 = -128;

        System.out.print("num2 : " + num2);

        num2--;                    //1이 감소

        System.out.print("num2 언더플로어 : " + num2);

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;

        System.out.println("firstNum *secondNum = " + multi);

        /* 3. 해결방법 */
        /* 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */

        long longMulti = firstNum * secondNum;

        System.out.println("firstNum *secondNum = " + longMulti);

        long result = (long)firstNum * secondNum;     //강제형 변환

        System.out.println("result : " + result);








    }
}
