package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {


        /* 수업목표. while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
         * [while문 표현식]
         * 초기식;
         * while(조건식) {
         *       조건에 만족하는 경우 수행할 구문(반복할 구문);
         *           증감식;
         * }
         * */

        /* 1부터 10까지 1씩 증가시키면서 10 i값을 출력하는 기본 반복문 */

        int i = 1;
        while (i <= 10) {

            System.out.println(i);
            i++;

        }
    }

    public void testWhileExample() {

        /* 입력한 문자열의 인덱스를 활용하여 문자 하나씩 출력해보기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /*
         * charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 반환하는 기능
         * length : String 클래스의 메소드로 문자열의 길이를 int 형으로 반환한다.
         * 인덱스는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.
         * */

        System.out.println("============ for문 ============");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(i + ":" + ch);
        }

        System.out.println("============ while문 ============");
        int index = 0;
        while (index < str.length()) {

            char ch = str.charAt(index);

            System.out.println(index + ":" + ch);

            index++;


        }
    }

    public void testWhileExample2() {

        /* 중첩된 while문의 흐름을 이해하고 적용할 수 있다. */
        /* while문으로 구구단 출력하기 */

        int dan = 2;
        while (dan < 10) {

            int su = 1;
            while (su < 10) {

                System.out.println(dan + "*" + "=" + (dan * su));

                su++;
            }
            dan++;
        }
    }

    public void testSimpleDowhileStatement() {

        /* do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
         * [do-while문 표현식]
         * 초기식;
         * do {
         *      1회차에는 무조건 실행하고 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 구문(반복할 구문);
         *      증감식;
         * } while(조건식);
         * */

        do {
            System.out.println("최초 한 번 동작함///");
        } while (false);
        System.out.println("반복문 종료 확인...");
    }

    public void testSimpleDowhileExample() {

        /* do-while문의 흐름을 이해하고 적용할 수 있다.
        * 키보드로 문자열 입력을 받아 반복적으로 출력
        * 단, exit가 입력되면 반복문을 종료한다.
        * */

        Scanner sc = new Scanner(System.in);
        String str = "";

        do {

            System.out.print("문자열을 입력하세요 : ");
            str = sc.nextLine();
            System.out.println(str);

            /* equals : 문자열은 == 비교가 불가능하다. 문자열이 같은지 비교하는지 기능 */
        }while (!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");


    }


    }
