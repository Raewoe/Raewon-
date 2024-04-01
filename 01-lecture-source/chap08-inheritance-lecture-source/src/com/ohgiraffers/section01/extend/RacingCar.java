package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    public RacingCar(){
        System.out.println("RacingCar 클래스 기본 생성자 호출됨...");
    }

    @Override
    public void run() {
        System.out.println("RacingCar가 전속력으로 질주를 시작합니다.");
    }

    @Override
    public void soundHorn() {
        System.out.println("우아아아아아아아아아아앙~~~~~(지나가는 소리)");
    }

    @Override
    public void stop() {
        System.out.println("끼이이이이이익(멈추는 소리)");
    }
}
