package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car() {
        System.out.println("Car 클래스 기본 생성자 호출됨...");

    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");

    }

    public void soundHorn() {

        if (isRuning()) {
            System.out.println("빠라빠라빠라밤");
        } else {
            System.out.println("주행 중이 아닌 상태에는 경적을 울릴 수 없습니다.");
        }

    }

    //private boolean isRuning() {

    protected boolean isRuning() {

        return runningStatus;
    }

    public void stop(){

        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }


}
