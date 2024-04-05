package com.ohgiraffers.section02.userencepction;

import com.ohgiraffers.section02.userencepction.excepction.PriceNagativeExcepction;

public class Application {
    public static void main(String[] args) {

        ExcepctionTest et = new ExcepctionTest();
        try {
            //et.checkEnougMoney(30000,50000);
            //et.checkEnougMoney(-50000, 10000);
            //et.checkEnougMoney(50000, -60000);
            et.checkEnougMoney(50000, 30000);


        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}
