package com.ohgoraffers.section01.init;

public class Application {

    public static void main(String[] args) {

        /*
        * 객체 배열에 대해 이해할 수 있다.
        *
        * 객체배열은 래처런스 변수에 대한 배열이다.
        * 생성한 인스턴스도 배열을 이용해서 관리하면
        * 동일한 타입 여려 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
        * 또한 반환값은 1개의 값만 반환할 수 있기 때눔에
        * 동일한 타입의 여러 인스턴스를 반환해야하는 경우 객체배열을 이용할 수 있다.
        * */

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티", 400);
        Car car5 = new Car("포터", 500);

        car1.dieverMaxSpeed();
        car2.dieverMaxSpeed();
        car3.dieverMaxSpeed();
        car4.dieverMaxSpeed();
        car5.dieverMaxSpeed();

        Car[] carArray = new Car[5];
        carArray[0] = new Car("페라리", 300);
        carArray[0] = new Car("람보르기니", 350);
        carArray[0] = new Car("롤스로이스", 250);
        carArray[0] = new Car("부가티", 400);
        carArray[0] = new Car("포터", 500);

        for (int i = 0; i<carArray.length; i++){
            carArray[i].dieverMaxSpeed();

        }

        Car[] carArray2 = {

                new Car("페라리", 300),
                new Car("람보르기니", 350),
                new Car("롤스로이스", 250),
                new Car("부가티", 400),
                new Car("포터", 500)

        };

        for (Car c : carArray2) {


        }


    }
}
