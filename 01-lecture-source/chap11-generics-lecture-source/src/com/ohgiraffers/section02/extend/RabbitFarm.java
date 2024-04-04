package com.ohgiraffers.section02.extend;

//public class RabbitFarm<T implements Animal>     //에러발생
//public class RabbitFarm<T extends Animal>        //정상
//public class RabbitFarm<T extends Rabbit>        //정상
//public class RabbitFarm<T extends Rabbit & Animal>  //클래수와 인터페이스 상소
//public class RabbitFarm<T extends Rabbit, snake>    //snake 변수로 변함

public class RabbitFarm<T extends Rabbit>{

    private T animal;

    public RabbitFarm(){}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}




