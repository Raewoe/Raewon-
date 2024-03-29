package com.ohgiraffers.section05.parameter;

public class RectAngle {

    private double width;

    private double hight;

    public RectAngle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return hight;
    }

    public void calcArea(){

        double area = width * hight;

        System.out.println("이 사각형의 넓이는 "+ area + "입니다");


    }
        public void calcRound() {

            double round = (width + hight) * 2;

            System.out.println("이 사각형의 둘레는 " + round + "입니다");

            System.out.println("사각형의 넓이와 둘레 ==============");





    }

    public void testVariableLengthArray(String name, String... hobby) {

        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수  : " + hobby.length);
        System.out.print("취미 : ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");

        }
        System.out.println();

    }


    public void setHeight(int i) {
    }
}
