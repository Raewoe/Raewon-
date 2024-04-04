package test;

import java.util.Scanner;

public class Testmethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int n = sc.nextInt();

        int[] num = new int[n];
        int min, max;

        System.out.println(n + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        min = max = num[0];

        for (int i = 0; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];

            }
        }









    }
}




