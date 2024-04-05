package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {

        ExcepctionTest et = new ExcepctionTest();

        try {
            et.checkEnougMoney(50000, 10000);

            System.out.println("============ 상품 구입 가능 =============");

        } catch (Exception e) {

            System.out.println("상품 구입 불가 ㅡㅡ");

        }
        System.out.println("프로그램이 종료합니다.");


    }
}
