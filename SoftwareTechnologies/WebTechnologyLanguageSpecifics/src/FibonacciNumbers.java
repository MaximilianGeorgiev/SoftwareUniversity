import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(inputScanner.nextLine());
        GetFibonacciLastNum(inputNum);
    }

    public static void GetFibonacciLastNum(int inputNum) {

        int firstNum = 1;
        int secondNum = 1;

        if (inputNum == 0){
            System.out.println("1");
            return;
        }

        for (int i = 0; i < inputNum; i++) {

            if (i == 0 && inputNum == 0) {
                System.out.println(firstNum);
                continue;

            }

            int oldFirst = firstNum;
            firstNum = secondNum;
            secondNum = oldFirst + secondNum;

            if (i == inputNum - 1) {
                System.out.println(firstNum);
            }

        }


    }

}


