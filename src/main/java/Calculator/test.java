package Calculator;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        test app = new test();

        Scanner sc = new Scanner(System.in);
        test test = new test();
        System.out.print("첫번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();

        System.out.print("두번쨰 정수를 입력해주세요 : ");
        int second = sc.nextInt();

        app.plusMethod(first, second);


    }


    // 결과값이 음수가 나오면 예외처리
    public void minusMethod(int num1, int num2) {
        int result = num1 - num2;
        if(result < 0){
            System.out.println("결과 값이음수가 나올 수 없습니다");
        } else {
            System.out.println("첫 번째 값에서 두 번째 값을 뺀 값은" + result);
        }
    }

    public void plusMethod(int num1, int num2) {
        int result = num1 + num2;
        if (result <= 100) {
            System.out.println(result);
        } 


    }






}
