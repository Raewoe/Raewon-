package com.ohgiraffers.section02.encapsulation.problem3;

import com.ohgiraffers.section01.user_type.Member;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근시 발생하는 문제를 해결*/

        Monster monster1 = new Monster();
        monster1.setinfo("피카츄");
        monster1.setHp(200);

        Monster monster2 = new Monster();
        monster2.setinfo("파이리");
        monster2.setHp(100);

        Monster monster3 = new Monster();
        monster3.setinfo("꼬부기");
        monster3.setHp(-200);

        System.out.println("monster1 = " + monster1.getInfo());
        System.out.println("monster2.getInfo() = " + monster2.getInfo());
        System.out.println("monster3.getInfo() = " + monster3.getInfo());
    }
}
