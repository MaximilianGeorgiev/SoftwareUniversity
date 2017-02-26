package CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(scanner.readLine());
        HashMap<String, Engine> engines = new HashMap<>();
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.readLine().split("\\s+");

            Engine engine = new Engine(input[0], Integer.parseInt(input[1]));

            if (input.length == 2) {
            } else if (input.length == 3) {
                boolean isNumber = checkIsNumber(input[2]);

                if (isNumber) {
                    engine.setDisplacement(Integer.parseInt(input[2]));
                } else {
                    engine.setEfficiency(input[2]);
                }
            } else if (input.length == 4) {
                engine.setDisplacement(Integer.parseInt(input[2]));
                engine.setEfficiency(input[3]);
            }
            engines.putIfAbsent(input[0], engine);
        }

        int m = Integer.parseInt(scanner.readLine());

        for (int i = 0; i < m; i++) {
            String[] input = scanner.readLine().split("\\s+");

            Car car = new Car(input[0], engines.get(input[1]));
            if (input.length == 3) {
                boolean isNumber = checkIsNumber(input[2]);

                if (isNumber) {
                    car.setWeight(Integer.parseInt(input[2]));
                } else {
                    car.setColor(input[2]);
                }
            } else if (input.length == 4){
                car.setWeight(Integer.parseInt(input[2]));
                car.setColor(input[3]);
            }
            cars.add(car);
        }

        for (Car car : cars) {
            int displacemenet = car.getEngine().getDisplacement();
            String weightOutput;
            String displacementOutput;
            int weight = car.getWeight();

            if (weight == 0){
                weightOutput = "n/a";
            } else {
                weightOutput = String.valueOf(weight);
            }

            if (displacemenet == 0){
                displacementOutput = "n/a";
            } else {
                displacementOutput = String.valueOf(displacemenet);
            }

            System.out.println(car.getModel() + ":");
            System.out.println(" " + car.getEngine().getEngineModel() + ":");
            System.out.printf("\tPower: %d%n", car.getEngine().getPower());
            System.out.printf("\tDisplacement: %s%n", displacementOutput);
            System.out.printf("\tEfficiency: %s%n", car.getEngine().getEfficiency());

            System.out.printf(" Weight: %s%n", weightOutput);
            System.out.printf(" Color: %s%n", car.getColor());
        }
    }

    private static boolean checkIsNumber(String s) {
        try {
            int i = Integer.parseInt(s);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
