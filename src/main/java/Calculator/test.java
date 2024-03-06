package Calculator;

public class test {


    

    public static void main(String[] args) {
   
    

        Scanner sc = new Scanner(System.in);


    


        boolean a = true;

        while (a) {
            System.out.println(" ===== 계산기를 실행해 보아요 =====");
            System.out.println("1.더하기 2.뺴기 3.곱하기 4.나누기 9.프로그램 종료 ");
            System.out.print("입력하세요 : ");
            int case11 = sc.nextInt();

            if (case11 == 9) {
                System.out.println("프로그램이 종료되었습니다.");
                a = false;
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
                        System.out.println("값을 잘못입력하셨어요!");
                        break;
                }
            }
        }
    }

    public  void plusMethod(int num1, int num2) {
        int result = num1 + num2;
        if (result <= 100) {
            System.out.println(result);
        }
    }

    public void multiMethod(int num1, int num2) {
        System.out.println("결과값은 " + num1 * num2 + "입니다");
    }

    public void minusMethod(int num1, int num2) {
        int result = num1 - num2;
        if (result < 0) {
            System.out.println("결과 값이음수가 나올 수 없습니다");
        } else {
            System.out.println("첫 번째 값에서 두 번째 값을 뺀 값은" + result);
        }
    }

    public void divisionMethod(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } else {
            int result = num1 / num2;
            System.out.println("나눈 결과는: " + result);
        }
    }
    public void githubtest(){

    }
  

}
