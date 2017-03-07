package AnimalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 200sx on 2/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        Chicken chicken = new Chicken();

        String name = scanner.readLine();
        int age = Integer.parseInt(scanner.readLine());

        boolean isInvalid = false;

        try {
            chicken.setName(name);
            chicken.setAge(age);
        } catch (IllegalArgumentException ex) {
            isInvalid = true;
            System.out.println(ex.getMessage());
        }

        if (!isInvalid){
            if (age < 6){
                System.out.printf("Chicken %s (age %d) can produce 2 eggs per day.", chicken.getName(), chicken.getAge());
            } else if (age >= 6 && age <= 12){
                System.out.printf("Chicken %s (age %d) can produce 1 eggs per day.", chicken.getName(), chicken.getAge());
            } else {
                System.out.printf("Chicken %s (age %d) can produce 0.75 eggs per day.", chicken.getName(), chicken.getAge());
            }
        }
    }
}
