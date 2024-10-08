package src.main.java.com.java0801.chap01.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application1 {
    public static void main(String[] args) throws IOException {
        /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         * */

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        int num = Integer.parseInt(input);

        if(num>0 && num<11) {
            if (num % 2 == 0) {
                System.out.println("짝수다.");
            } else {
                System.out.println("홀수다.");
            }
        } else {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }
    }

}
