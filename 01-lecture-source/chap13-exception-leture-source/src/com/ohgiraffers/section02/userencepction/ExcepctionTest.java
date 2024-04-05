package com.ohgiraffers.section02.userencepction;

import com.ohgiraffers.section02.userencepction.excepction.MoneyNegativeExcepction;
import com.ohgiraffers.section02.userencepction.excepction.NotEnougMoneyExcepction;
import com.ohgiraffers.section02.userencepction.excepction.PriceNagativeExcepction;

public class ExcepctionTest {

    public void checkEnougMoney(int price, int money) throws PriceNagativeExcepction, MoneyNegativeExcepction, NotEnougMoneyExcepction {

        if (price < 0) {

            throw new PriceNagativeExcepction("상품 가격은 음수일 수 없습니다.");
        }

        if (money < 0) {
            throw new MoneyNegativeExcepction("가진 돈은 음수일 수 없습니다.");
        }

        if (money < price) {

            throw new NotEnougMoneyExcepction("가진 돈보다 상품이 더 비쌉니다.");


        }



        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 되세요.");





    }
}
;