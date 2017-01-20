import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstOddOrEvenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] collection = Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] command = scanner.nextLine().split("\\s");

        ArrayList<Integer> numbersMeetingRq = new ArrayList<Integer>();

        if (command[2].equals("odd")){
            for (int i = 0; i < collection.length; i++) {
                if (collection[i] % 2 != 0){
                    numbersMeetingRq.add(collection[i]);
                }
                if (numbersMeetingRq.size() == Integer.parseInt(command[1])){
                    break;
                }
            }
        } else if (command[2].equals("even")){
            for (int i = 0; i < collection.length; i++) {
                if (collection[i] % 2 == 0){
                    numbersMeetingRq.add(collection[i]);
                }
                if (numbersMeetingRq.size() == Integer.parseInt(command[1])){
                    break;
                }
            }
        }

        for (int number : numbersMeetingRq){
            System.out.printf("%d ", number);
        }
    }
}
