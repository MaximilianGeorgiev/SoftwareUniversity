package CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 200sx on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String input = scanner.readLine();
        CustomList<String> list = new CustomList<String>();

        while (!input.equals("END")){
            String[] inputTokens = input.split("\\s+");

            switch(inputTokens[0]){
                case "Add":
                    list.add(inputTokens[1]);
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;

                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(inputTokens[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(inputTokens[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(inputTokens[1]), Integer.parseInt(inputTokens[2]));
                    break;
                case "Print":
                    list.print();
                    break;
            }

            input = scanner.readLine();
        }
    }
}
