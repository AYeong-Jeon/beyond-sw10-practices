package src.main.java.com.chap02.level01;

public class Calculator {

    //메소드 호출 확인용 메소드 호출
    //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
    //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
    //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
    //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    };

    public int sum1to10() {
        int num =0;
        for (int i=1; i<=10; i++) {
            num += i;
        }

        return num;
    };

    public void checkMaxNumber(int a, int b) {
        int num = Integer.max(a, b);
        System.out.println("두 수 중 큰 수는 " + num + "이다.");
    };

    public int sumTwoNumber(int a, int b) {
        int num =Integer.sum(a,b);

        return num;
    };

    public int minusTwoNumber(int a, int b) {
        int num = a-b;

        return num;
    };

}
