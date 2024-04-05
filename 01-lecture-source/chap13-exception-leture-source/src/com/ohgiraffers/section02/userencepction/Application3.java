package com.ohgiraffers.section02.userencepction;

import com.ohgiraffers.section02.userencepction.excepction.MoneyNegativeExcepction;
import com.ohgiraffers.section02.userencepction.excepction.NotEnougMoneyExcepction;
import com.ohgiraffers.section02.userencepction.excepction.PriceNagativeExcepction;

public class Application3 {
    public static void main(String[] args) {

        ExcepctionTest et = new ExcepctionTest();

        try {
            et.checkEnougMoney(200000,300000);
        } catch (PriceNagativeExcepction | MoneyNegativeExcepction e) {

            /* 예외가 발생한 클래스의 이름을 알 수 있다. */
            System.out.println(e.getClass() + "발생");

        } catch (NotEnougMoneyExcepction e) {

            /* 예외 클래스명, 예외 발생위치, 예외 메세지를 stack 호출 역순으로
            * 빨간색 글씨를 이용해서 로그 형태로 출력해주는 기능*/
            e.printStackTrace();

        }finally {

            System.out.println("파이널 동장함");
        }

        System.out.println("프로그램을 종료");

    }
}
