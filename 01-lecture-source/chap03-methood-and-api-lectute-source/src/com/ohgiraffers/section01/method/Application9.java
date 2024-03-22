package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메소드를 호출할 수 있다. */
        /* 다른 클래스에 작성한 메소드 호출*/

        /* 최대값 최소값을 비교한 두 정수의 변수로 선언*/

        int first = 100;
        int second = 50;

        /* non-static 메소드의 경우 */
        /*
        * 클래스가 다르더라도 사용하는 방법은 동일하다.
        * 클래스명 사용할이름 = new 클래스명();
        * 사용할이름, 메소드명();
        * */

        Calculator cal = new Calculator();
        int min = cal.minNumber0f(first,second);

        System.out.println("두 수 중 최소값은? " + min);

        /* static 메소드인 경우 */
        /* 다른 클래스에 작성한 스테틱 메소드이 경우 호출할 때 클래스명을 반드시 기술해야한다.
        * 클래스명.메소드명();
        * */

        //int max = maxNumber0f(first, second);       //클래스명을 생략하면 에럭발생
        int maxNumber = Calculator.maxNumber0f(first, second);
        System.out.println("두 수 중 최대값은? "+ maxNumber);

        /*
        * 스테틱 메소드는 논-스테틱 메소드처럼 호출은 가능하지만
        * 권장하지 않는다
        * 이미 메모리에 로딩외어있는 스테틱 메소드는 여러 객체가 공유하게 된다
        * 그때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발하 수 있기 때문에
        * 사용을 제한해 달리는 경고다. 시스템이 복잡할 수록 유지보수에 악영향을 준다
        * */

        int max2 = cal.maxNumber0f(first, second);

        System.out.println("두 수 중 최대값은? " + max2);



    }
}
