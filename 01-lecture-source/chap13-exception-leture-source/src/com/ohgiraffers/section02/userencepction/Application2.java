package com.ohgiraffers.section02.userencepction;

import com.ohgiraffers.section02.userencepction.excepction.MoneyNegativeExcepction;
import com.ohgiraffers.section02.userencepction.excepction.NotEnougMoneyExcepction;
import com.ohgiraffers.section02.userencepction.excepction.PriceNagativeExcepction;

public class Application2 {
    public static void main(String[] args) {

        ExcepctionTest et = new ExcepctionTest();

        try {
            //et.checkEnougMoney(20000,30000);
            et.checkEnougMoney(-50000, 30000);


            System.out.println("정상 동작 합니다.");

        } catch (NotEnougMoneyExcepction e) {

            System.out.println("NotEnougMoneyExcepction 발생");
            System.out.println(e.getMessage());

        } catch (PriceNagativeExcepction e) {

            System.out.println("PriceNegativeExcepction 발생");
            System.out.println(e.getMessage());

        } catch (MoneyNegativeExcepction e) {

            System.out.println("MoneyNegativeExcepction 발생");
            System.out.println(e.getMessage());

        } finally {

            /* 예외 발생 여부와 상관없이 실해 */
            System.out.println("finally 블럭 내용이 동작함");
        }


    }
}
