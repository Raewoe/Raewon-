package com.ohgiraffers.section02.encapsulation.problem4;
public class Application {

    public static void main(String[] args) {

        /* 접근제한에 대해 이해하고 필드에 접근하지 못하게 */

        /* 1. private에 필드에 직접 접근하여 comli*/
        Monster monster1 = new Monster();
        //monster1.kinds =  "피카츄";      //에러발생
        //.hp = 200;                      //에러발생

        /* 2. public메소드를 이용하여 필드에 간접 접근 */
        monster1.setKinds("피카츄");
        monster1.setHp(200);

        System.out.println("monster1.getInfo() = " + monster1.getInfo());

        /* 캡슐화는 유지보수성을 증가시키기 위해 직접 접근을 제한하고
        * public메소드를 이용해서 간접적으로 접근하여 사용할 수 있도록 만든 기술이다
        * 클래스 작성 시 특별한 목적이 아닌 이상 캡슐화를 긴본 원칙으로 사용되고 있다
        * */







    }






}
