package Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by 200sx on 3/6/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String[] carArgs = scanner.readLine().split("\\s+");
        String[] truckArgs = scanner.readLine().split("\\s+");

        Car car = new Car(Double.parseDouble(carArgs[1]), Double.parseDouble(carArgs[2]));
        Truck truck = new Truck(Double.parseDouble(truckArgs[1]), Double.parseDouble(truckArgs[2]));

        int n = Integer.parseInt(scanner.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.readLine().split("\\s+");

            DecimalFormat format = new DecimalFormat("0.######");

            switch (input[0]) {
                case "Drive":
                    if (input[1].equals("Car")) {
                        try {
                            car.drive(Double.parseDouble(input[2]));
                            String output = format.format(Double.parseDouble(input[2]));
                            System.out.printf("Car travelled %s km%n", format.format(Double.parseDouble(input[2])));
                        } catch (IllegalArgumentException ex) {
                            System.out.println("Car " +ex.getMessage());
                            continue;
                        }
                    } else if (input[1].equals("Truck")){
                        try {
                            truck.drive(Double.parseDouble(input[2]));
                            System.out.printf("Truck travelled %s km%n", format.format(Double.parseDouble(input[2])));
                        } catch (IllegalArgumentException ex) {
                            System.out.println("Truck " +ex.getMessage());
                            continue;
                        }
                    }
                    break;
                case "Refuel":
                    if (input[1].equals("Car")){
                        car.addFuel(Double.parseDouble(input[2]));
                    } else if (input[1].equals("Truck")){
                        truck.addFuel(Double.parseDouble(input[2]));
                    }
                    break;

            }
        }

        System.out.printf("Car: ");
        car.getFuelQuantity();
        System.out.println();
        System.out.printf("Truck: ");
        truck.getFuelQuantity();

    }
}
