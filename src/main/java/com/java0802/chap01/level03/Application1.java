package src.main.java.com.java0802.chap01.level03;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 1 2 3 4 3 2 1
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 8
         *
         * -- 출력 예시 --
         * 양수 혹은 홀수만 입력해야 합니다.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("홀수인 양의 정수를 입력하세요.");
        int odd = sc.nextInt();

        if (odd % 2 == 1) {
            int[] iarr = new int[odd];
            int mid = (int) (odd / 2 + 1);
            int cnt = 0;

            for (int i = 0; i < mid; i++) {
                iarr[i] = ++cnt;
            }

            for (int i = mid; i < iarr.length; i++) {
                iarr[i] = --cnt;
            }

            for (int j : iarr) {
                System.out.print(j + " ");
            }

        } else {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }
    }
}
