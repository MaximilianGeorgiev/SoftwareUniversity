package SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scanner.readLine());

        LinkedHashMap<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.readLine().split("\\s+");

            if (cars.containsKey(input[0])) {
                continue;
            }
            Car currentCar = new Car(input[0], Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            cars.put(input[0], currentCar);
        }

        String input = scanner.readLine();

        while (!input.equals("End")) {
            String[] inputSplit = input.split("\\s+");

            if (!cars.containsKey(inputSplit[1])) {
                continue;
            }

            Car currentCar = cars.get(inputSplit[1]);

            if (!currentCar.canDriveDistance(Double.parseDouble(inputSplit[2]))) {
                System.out.println("Insufficient fuel for the drive");
            }

            cars.put(inputSplit[1], currentCar);
            input = scanner.readLine();
        }

        for (Car car : cars.values()) {
            System.out.printf("%s %.2f %.0f%n", car.getModel(), car.getFuelAmount(), car.getDistanceTravelled());
        }
    }
}




