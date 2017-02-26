package CatLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by 200sx on 2/26/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Cat> cats = new ArrayList<>();

        String input = scanner.readLine();

        while (!input.equals("End")) {
            String[] arguments = input.split("\\s+");
            Cat currentCat = new Cat(arguments[1]);

            switch (arguments[0]) {
                case "Siamese":
                    currentCat = new SiameseBreed(arguments[1], Double.parseDouble(arguments[2]));
                    break;
                case "Cymric":
                    currentCat = new Cymric(arguments[1], Double.parseDouble(arguments[2]));
                    break;
                case "StreetExtraordinaire":
                    currentCat = new StreetExtraordinaire(arguments[1], Double.parseDouble(arguments[2]));
                    break;
            }
            cats.add(currentCat);
            input = scanner.readLine();
        }
        String catToSearch = scanner.readLine();

        cats.stream().filter(x -> x.getName().equals(catToSearch)).limit(1).forEach(x -> System.out.println(x));



    }
}
