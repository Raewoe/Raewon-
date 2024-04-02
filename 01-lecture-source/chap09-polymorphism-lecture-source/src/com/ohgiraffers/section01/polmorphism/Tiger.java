package com.ohgiraffers.section01.polmorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑인는 고라니를 뜯어먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 웬만하면 달리지 않습니다.");
    }

    @Override
    public void cry() {
        System.out.println("호라이가 사자후를 내뱉습니다. 어흐으으응");
    }

    public void bite(){
        System.out.println("호랑이가 물어뜯습니다.앙앙");
    }
}
