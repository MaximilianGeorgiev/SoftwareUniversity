import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        long inputNumber = Long.parseLong(inputScanner.nextLine());
        String result = isNumberPrime(inputNumber);
        System.out.println(result);

    }

    public static String isNumberPrime(long inputNumber){

        String result = "True"; // they require "True" instead of "true" so bool is not suitable

        if (inputNumber == 0) {
            result = "False";
            return result;
        }

        else if (inputNumber == 1){
            result = "False";
            return result;
        }

        else if (inputNumber == 2){
            return result;
        }

        for (int i = 2; i < Math.sqrt(inputNumber) + 1; i++){

            if(inputNumber % i == 0){
                result = "False";
                break;
            }

        }
        return result;
    }
}
