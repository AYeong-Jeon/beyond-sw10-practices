package src.main.java.com.java0801.chap01.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application1 {
    public static void main(String[] args) throws IOException {

        /* 두 개의 정수를 입력 받아 변수에 저장하고,
         * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
         * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
         *
         * -- 입력 예시 --
         * 첫 번째 정수 : 4
         * 두 번째 정수 : 3
         * 연산 기호를 입력하세요 : +
         *
         * -- 출력 예시 --
         * 4 + 3 = 7
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine(), ",");
        int a = Integer.parseInt(input.nextToken());
        int b = Integer.parseInt(input.nextToken());
        String sign = input.nextToken();
        String[] test = {"+", "-", "/", "*", "%"};

        int count = 0;
        for (String s : test) {
            if (sign.equals(s)) {
                System.out.println(a + s + b + " = " + (a + b));
                count++;
                break;
            }
        }
        if(count == 0) {
            System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }

    }
}
