package Calculator;

import Calculator.exception.ErrorException;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean a = true;
        test app = new test();

        System.out.println(" ===== 계산기를 실행해 보아요 =====");

        while (a) {
            System.out.println("1.더하기 2.뺴기 3.곱하기 4.나누기 9.프로그램 종료 ");
            System.out.print("입력하세요 : ");
            int case11 = sc.nextInt();

            if (case11 == 9) {
                System.out.println("프로그램이 종료되었습니다.");
                a = false;
            } else if (case11 >= 5 && case11 <=8 || case11 == 0) {
                try{
                    throw new ErrorException("잘못 입력 하셨습니다.");
                } catch (Exception e){
                    throw new RuntimeException(e);
                }
            } else {
                System.out.print("첫번째 값 입력 :");
                int first = sc.nextInt();
                System.out.print("두번째 값 입력 :");
                int second = sc.nextInt();

                switch (case11) {
                    case 1:
                        app.plusMethod(first, second);
                        break;
                    case 2:
                        app.minusMethod(first, second);
                        break;
                    case 3:
                        app.multiMethod(first, second);
                        break;
                    case 4:
                        app.divisionMethod(first, second);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public  void plusMethod(int num1, int num2) {
        // 결과 값이 100이 넘어가면 error 가 뜨게 하기
        Exceptiontest et = new Exceptiontest();
        try {
            et.plusError(num1, num2);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    // 결과 값이 0 보다 작으면 error 가 뜨게 하기
    public void minusMethod(int num1, int num2) {
        Exceptiontest et = new Exceptiontest();
        try {
            et.minusError(num1, num2);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    // 결과 값이 100이 넘어가면 error 가 뜨게 하기
    public void multiMethod(int num1, int num2) {
        Exceptiontest et = new Exceptiontest();
        try {
            et.multiError(num1, num2);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    // 결과 값이 0이면 error 가 뜨게 하기
    public void divisionMethod(int num1, int num2) {
        Exceptiontest et = new Exceptiontest();
        try {
            et.divisionError(num1, num2);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }


}
