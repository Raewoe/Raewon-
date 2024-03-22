package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        /* 수업목표. 매개변수와 리턴값을 복합적으로 화용하는 것을 이해하고 활용할 수 있다. */
        /*
        * 매개변수와 리턴값 복합활용
        * 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하며 간단한 계산기 만들기
        * */

        int frist = 25;
        int second = 20;

        Application7 app7 = new Application7();
        System.out.println("두 수를 더한 결과 : " + app7.plusTwoNum(frist,second));
        System.out.println("두 수를 뺀 결과 : " + app7.minusTwonum(frist,second));
        System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNum(frist,second));
        System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNum(frist,second));

    }

    public int plusTwoNum(int frist, int second) {

        return frist + second;

    }

    public int minusTwonum(int frist,int second) {

        return frist - second;

    }

    public int multipleTwoNum(int frist, int second) {

        return frist * second;
    }

    public int divideTwoNum(int frist, int second) {

        return frist / second;

    }

}
