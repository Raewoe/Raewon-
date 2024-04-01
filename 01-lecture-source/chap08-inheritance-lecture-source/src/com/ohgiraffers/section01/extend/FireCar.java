package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar(){

        super();

        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }

    @Override
    public void soundHorn() {

        if (isRuning()) {

            System.out.println("빵빵 비켜 죽기 싫으면");

        }else {
            System.out.println("지나가게 비켜주세요.");
        }
    }

    public void sprayWater(){

        System.out.println("불난 곳을 발견했습니다 물을 뿌립니다 =========");
    }

}
