package StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 200sx on 4/2/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String command = scanner.readLine();

        StackIterator stack = new StackIterator();

        while (!command.equals("END")) {
            String[] commandArgs = command.split("\\s+");

            if (commandArgs.length == 1) {
                try {
                    stack.pop();
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                for (int i = 1; i < commandArgs.length; i++) {
                    if (commandArgs[i].endsWith(",")) {
                        stack.push(Integer.parseInt(commandArgs[i].substring(0, commandArgs[i].length() - 1)));
                    } else {
                        stack.push(Integer.parseInt(commandArgs[i]));
                    }
                }
            }

            command = scanner.readLine();
        }
        if (stack.isEmpty()) {
            System.out.println("No elements");
            return;
        }

        ArrayList<Integer> ints = new ArrayList<>();

            for (Integer integer : stack) {
                ints.add(integer);
            }

        for (int i = 0; i < 2; i++) {
            for (Integer integer : ints) {
                System.out.println(integer);
            }
        }

    }
}
