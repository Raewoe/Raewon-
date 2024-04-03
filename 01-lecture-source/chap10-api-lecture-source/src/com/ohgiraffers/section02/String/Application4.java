package com.ohgiraffers.section02.String;

public class Application4 {
    public static void main(String[] args) {

        /* 이스케이프(escape) 문자에 대해 이해하고 적용할 수 있다. */
        /*
        * 이스케이프란?
        * 문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
        * 이스케이프문자 의미
        *        \n   개행(줄바꿈)
        *        \t   탭
        *        \'   작은따움표
        *        \"   큰따움표
        *        \\   역슬래시
        * */

        System.out.println("안녕하세요\n저는 이래원입니다.");

        System.out.println("안녕하세요\t저는 이래원입니다.");

        System.out.println("안녕하세요 저는 이래원입니다.");
        //System.out.println('');     //

        System.out.println("안녕하세요 저는 \"이래원\"입니다.");

        System.out.println("안녕하세요 저는 \\이래원\\입니다.");


    }
}
