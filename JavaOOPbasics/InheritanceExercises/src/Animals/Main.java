package Animals;

import Animals.Cats.Cat;
import Animals.Cats.Kitten;
import Animals.Cats.Tomcat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by 200sx on 3/5/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String input = scanner.readLine();
        ArrayList<Animal> animals = new ArrayList<>();

        while (!input.equals("Beast!")) {
            Cat cat = new Cat();
            Dog dog = new Dog();
            Frog frog = new Frog();
            Tomcat tomcat = new Tomcat();
            Kitten kitten = new Kitten();
            Animal animal = new Animal();

            String[] params = scanner.readLine().split("\\s+");

            switch (input) {
                case "Cat":
                    try {
                        cat = new Cat(params[0], Integer.parseInt(params[1]), params[2]);
                        animals.add(cat);
                        System.out.printf("Cat%n%s %d %s%n", cat.getName(), cat.getAge(), cat.getGender());
                        cat.produceSound();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        input = scanner.readLine();
                        continue;
                    }
                    break;
                case "Dog":
                    try {
                        dog = new Dog(params[0], Integer.parseInt(params[1]), params[2]);
                        animals.add(dog);
                        System.out.printf("Dog%n%s %d %s%n", dog.getName(), dog.getAge(), dog.getGender());
                        dog.produceSound();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        input = scanner.readLine();
                        continue;
                    }
                    break;

                case "Frog":
                    try {
                        frog = new Frog(params[0], Integer.parseInt(params[1]), params[2]);
                        animals.add(frog);
                        System.out.printf("Frog%n%s %d %s%n", frog.getName(), frog.getAge(), frog.getGender());
                        frog.produceSound();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        input = scanner.readLine();
                        continue;
                    }
                    break;

                case "Tomcat":
                    try {
                        tomcat = new Tomcat(params[0], Integer.parseInt(params[1]), params[2]);
                        animals.add(tomcat);
                        System.out.printf("Tomcat%n%s %d %s%n", tomcat.getName(), tomcat.getAge(), tomcat.getGender());
                        tomcat.produceSound();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        input = scanner.readLine();
                        continue;
                    }
                    break;

                case "Kitten":
                    try {
                        kitten = new Kitten(params[0], Integer.parseInt(params[1]), params[2]);
                        animals.add(kitten);
                        System.out.printf("Kitten%n%s %d %s%n", kitten.getName(), kitten.getAge(), kitten.getGender());
                        kitten.produceSound();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        input = scanner.readLine();
                        continue;
                    }
                    break;
                default:
                    try {
                        animal = new Animal(params[0], Integer.parseInt(params[1]), params[2]);
                        animals.add(animal);
                        System.out.printf("%s%n%s %d %s%n", params[0], kitten.getName(), kitten.getAge(), kitten.getGender());
                        animal.produceSound();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        input = scanner.readLine();
                        continue;
                    }
            }
            input = scanner.readLine();
        }
    }
}

