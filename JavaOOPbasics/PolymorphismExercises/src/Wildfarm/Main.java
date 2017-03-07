package Wildfarm;

import Wildfarm.Animal.*;
import sun.font.FontRunIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 200sx on 3/7/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        Animal animal = new Cat();

        for (int i = 0; i < 50000; i++) {
            String[] inputArgs = scanner.readLine().split("\\s+");

            if (inputArgs[0].equals("End")) {
                break;
            }

            if (i % 2 == 0) {

                switch (inputArgs[0]) {
                    case "Mouse":
                        animal = new Mouse(inputArgs[0], inputArgs[1], Double.parseDouble(inputArgs[2]), inputArgs[3]);
                        break;
                    case "Felime":
                        animal = new Felime(inputArgs[0], inputArgs[1], Double.parseDouble(inputArgs[2]), inputArgs[3]);
                        break;
                    case "Tiger":
                        animal = new Tiger(inputArgs[0], inputArgs[1], Double.parseDouble(inputArgs[2]), inputArgs[3]);
                        break;

                    case "Zebra":
                        animal = new Zebra(inputArgs[0], inputArgs[1],  Double.parseDouble(inputArgs[2]), inputArgs[3]);
                        break;

                    case "Cat":
                        animal = new Cat(inputArgs[0], inputArgs[1],  Double.parseDouble(inputArgs[2]),inputArgs[3], inputArgs[4]);
                        break;
                }
            } else {
                try {
                    animal.makeSound();
                    animal.eat(inputArgs);
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
                System.out.println(animal);
            }
        }
    }
}
