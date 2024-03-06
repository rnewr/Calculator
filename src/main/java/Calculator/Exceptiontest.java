package Calculator;

import Calculator.exception.ErrorException;

public class Exceptiontest extends Exception {

    public void plusError(int num1, int num2) throws ErrorException {
        int plusResult = num1 + num2;
        if (plusResult <= 100) {
            System.out.println("더하기 결과값은 = " + plusResult);
        } else throw new ErrorException("더하기 결과값이 100을 넘어갈 수 없습니다");
    }
    public void minusError(int num1, int num2) throws ErrorException {
        int minusResult = num1 - num2;
        if (minusResult < 0) {
            throw new ErrorException("뺄셈 결과 값이 음수가 나올 수 없습니다");
        }
        System.out.println("뺄셈 결과값은 = " + minusResult);
    }
    public void multiError(int num1, int num2) throws ErrorException {
        int multiResult = num1 * num2;
        if (multiResult >= 100) {
            throw new ErrorException("결과 값이 100보다 클 수 없습니다.");
        }
        System.out.println("곱셈 결과값은 = " + multiResult);
    }

    public void divisionError(int num1, int num2) throws ErrorException {
        if (num2 == 0) {
            throw new ErrorException("0으로 나눌 수 없습니다");
        } else {
            int divisionResult = num1 / num2;
            System.out.println("나눗셈 결과값은 = " + divisionResult);
        }
    }


}
