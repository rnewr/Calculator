package Calculator;

import java.util.Scanner;

public class asd {

    public static void main(String[] args) {

        test app = new test();

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();


        app.minusMethod(first,second);
    }

    /* 곱셈 */
    public void multi (int num1,int num2) {
        System.out.println(num1+"*"+num2);
        int result = num1 * num2;
        System.out.println("결과 값은 " + result + "입니다.");

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

    /* 곱셈_예외 만들기: 결과값이 0 나오면 안됨 */
    public void multiException(int num1, int num2) {

        try {
            System.out.println("결과값은 " + num1 * num2 + "입니다");


        } catch (IllegalArgumentException e) {
            System.out.println(e);

        }


    }