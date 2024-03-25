package com.ohgiraffers.section01.conditional;

public class Application1 {

    public static void main(String[] args) {

        A_if a = new A_if();
        /* 단독 if문 흐름 확인용 메소드 출력 */
        //a.testSimpleIfStatement();

        /* 중첩된 if문 흐름 확인용 메소드 출력*/
        //a.testNestedIfStatement();

        /* if else 흐름 확인용 메소드 출력*/
        B_ifElse b = new B_ifElse();
        //b.simpleIfElseStatement();
        //b.testNeatedIfElseStatement();

        /**/
        C_ifElseif c = new C_ifElseif();
        //c.testSimpleIfElseIfStatement();

        D_switch d = new D_switch();
        //d.testSimpleSeitchStatement();
        d.testSwitchVendingMachine();
















    }
}
