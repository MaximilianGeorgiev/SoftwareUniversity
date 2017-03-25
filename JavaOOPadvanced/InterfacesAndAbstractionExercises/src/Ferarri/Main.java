package Ferarri;

import java.util.Scanner;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ferrari ferrari = new Ferrari(scanner.nextLine());
        System.out.println(ferrari);
    }
}
