package BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String input = scanner.readLine();
        ArrayList<Birthable> creatures = new ArrayList<>();

        while (!input.equals("End")){
            String[] inputArgs = input.split("\\s+");

            switch (inputArgs[0]){
                case "Citizen":
                    creatures.add(new Citizen(inputArgs[1], Integer.parseInt(inputArgs[2]), inputArgs[3], inputArgs[4]));
                    break;
                case "Pet":
                    creatures.add(new Pet(inputArgs[1], inputArgs[2]));
                    break;
                case "Robot":
                    creatures.add(new Robot(inputArgs[1], inputArgs[2]));
                    break;
            }
            input = scanner.readLine();
        }
        String searchedBirthdate = scanner.readLine();

        for (Birthable creature : creatures) {
            if (!creature.getBirthday().equals("-1") && creature.getBirthday().split("\\/")[2].equals(searchedBirthdate)) {
                System.out.println(creature.getBirthday());
            }
        }



    }
}
