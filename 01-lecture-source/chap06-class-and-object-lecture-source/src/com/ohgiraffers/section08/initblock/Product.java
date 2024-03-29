package com.ohgiraffers.section08.initblock;

public class Product {

    /* 1. 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체가 생성된다. */

    /*private String name;
    private  int price;
    private static String brand;
    */

    /* 2. 명시적 초기화 */

    private String name = "아이폰";
    private int price = 1000000;
    private static String brand = "애플";

    /* 3. 인스턴스 초기화 블러 */

    {

        name = "사이어";
        price = 900000;

        /* 주의사항
        * 인스턴스 초기화 블럭에서는 static 필드를 초기화 할 수 있는 거처럼 보인다.
        * 하지만 static 초기화 블럭은 클래스 로드 될 때 이미 기본값으로 초기화를 진행했다.
        * 따라서 인스턴스 초기화 블러이 동작하는 시점에는 이미 초기화가 진행된 정적 필드에
        * 인스턴스 초기화 블러에서 대입한 값으로 덮어쓰기 되는 것이다.
        * */

        brand = "삼성";
        System.out.println("인스턴스 초기화 블럭 동작함...");


    }


    static {

        /* 주의사항
         * static 초기화블럭에서는 non-static 필드를 초기화하지 못 한다.
         * 정적 초기화 블럭은 클래스 로드시에 동작한다.
         * 따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 때문에
         * 존재하지 않은 인스턴스 변수에 초기화 하는 것은
         * 시기상으로 불가능하다.
         * */

        //name = "아이폰";
        // price = 55000000;
        brand = "헬지";
        System.out.println("정적 초기화 블럭 동작함...");


        }

        public Product(){
            System.out.println("기본 생성자 호출됨...");
        }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개");




    }


    public String getInformation(){

        return "product [name = " + this.name + " , price = " + this.price + " , brand ="
                + Product.brand+"]";








    }

}
