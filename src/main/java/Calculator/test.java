package Calculator;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        test app = new test();

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();


        app.minusMethod(first,second);
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
}
}
