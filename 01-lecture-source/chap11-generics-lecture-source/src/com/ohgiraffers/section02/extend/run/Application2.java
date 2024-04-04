package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 와일드 카드에 대해 이해할 수 있다. */
        /*
         * 와일드카드란?
         * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
         * 그 객체의 타입 변수를 제한할 수 있다.
         * <?(아무거나)>  : 제한 없음
         * <? extends Type> : 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)
         * <? super Type> : 와일드카드의 하한 제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능
         * */

        WildCardFarm wildCardFarm = new WildCardFarm();
        //wildCardFarm.anyTpye(new RabbitFarm<>(Mammal)(new Rabbit()));

        wildCardFarm.anyTpye(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyTpye(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyTpye(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("===================================================================");
        //wildCardFarm.extnedsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extnedsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extnedsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("====================================================================");
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        //wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


    }
}
