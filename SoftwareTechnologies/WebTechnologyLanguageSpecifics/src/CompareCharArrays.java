import java.util.Scanner;

/**
 * Created by sasaas on 29.10.2016 г..
 */
public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String[] firstArray = inputScanner.nextLine().split(" ");
        String[] secondArray = inputScanner.nextLine().split(" ");

        if (firstArray.length == secondArray.length) {

            for (int i = 0; i < firstArray.length; i++) {

                if (firstArray[i].charAt(0) > secondArray[i].charAt(0)) {
                    PrintArrays(secondArray);
                    PrintArrays(firstArray);
                    break;
                } else if (firstArray[i].charAt(0) < secondArray[i].charAt(0)) {
                    PrintArrays(firstArray);
                    PrintArrays(secondArray);
                    break;
                } else {
                    PrintArrays(firstArray);
                    PrintArrays(secondArray);
                    break;
                }
            }
        } else {
            int shorterArray = Math.min(firstArray.length, secondArray.length);

            for (int i = 0; i < shorterArray; i++) {

                if (firstArray[i].charAt(0) > secondArray[i].charAt(0)) {
                    PrintArrays(secondArray);
                    PrintArrays(firstArray);
                    break;
                }

                if (firstArray[i].charAt(0) < secondArray[i].charAt(0)) {
                    PrintArrays(firstArray);
                    PrintArrays(secondArray);
                    break;
                } else {
                    if (firstArray.length < secondArray.length) {

                        PrintArrays(firstArray);
                        PrintArrays(secondArray);
                    } else if (firstArray.length > secondArray.length) {
                        PrintArrays(secondArray);
                        PrintArrays(firstArray);
                    }
                    break;
                }
            }
        }
    }

    public static void PrintArrays(String[] arrayToInput) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arrayToInput.length; i++) {
            sb.append(arrayToInput[i]);
        }
        System.out.println(sb);
    }
}
