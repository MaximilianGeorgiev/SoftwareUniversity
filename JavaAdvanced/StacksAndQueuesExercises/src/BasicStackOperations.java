import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] requestInfo = scanner.nextLine().split(" ");

        int itemsToAdd = Integer.valueOf(requestInfo[0]);
        int itemsToPop = Integer.valueOf(requestInfo[1]);
        int itemToCheck = Integer.valueOf(requestInfo[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] itemsList = scanner.nextLine().split(" ");

        for (int i = 0; i < itemsToAdd; i++) {
            stack.push(Integer.valueOf(itemsList[i]));
        }
        for (int i = 0; i < itemsToPop; i++) {
            stack.pop();
        }

        if (stack.size() == 0){
            System.out.println(0);
            return;
        }

        int smallestNum = 0;

        if (stack.contains(itemToCheck)){
            System.out.println("true");
        } else {
            smallestNum = Integer.MAX_VALUE;

            while (stack.size() > 1){
                if (stack.peek() < smallestNum){
                    smallestNum = stack.pop();
                } else {
                    stack.pop();
                }
            }

            if (stack.size() == 1){
                smallestNum = stack.pop();
            }

            System.out.println(smallestNum);
        }






    }
}