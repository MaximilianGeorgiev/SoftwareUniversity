package RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scanner.readLine());

        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.readLine().split("\\s+");

            String model = input[0];
            Engine engine = new Engine(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            Cargo cargo = new Cargo(Integer.parseInt(input[3]), input[4]);

            ArrayList<Tire> tires = generateTires(input);

            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String typeToSearch = scanner.readLine();

        if (typeToSearch.equals("fragile")) {
            for (Car car : cars) {
                boolean meetsRq = false;

                if (car.getCargo().getType().equals(typeToSearch)) {
                    for (Tire tire : car.getTires()) {
                        if (tire.getPressure() < 1) {
                            meetsRq = true;
                            break;
                        }
                    }
                    if (meetsRq) {
                        System.out.printf("%s%n", car.getModel());
                    }
                }
            }
        } else if (typeToSearch.equals("flamable")){
            for (Car car : cars) {
                if (car.getCargo().getType().equals(typeToSearch)){
                    if(car.getEngine().getPower() > 250) {
                            System.out.printf("%s%n", car.getModel());

                    }
                }
            }
        }
    }

    private static ArrayList<Tire> generateTires(String[] input) {
        Tire tire1 = new Tire(Double.parseDouble(input[5]), Integer.parseInt(input[6]));
        Tire tire2 = new Tire(Double.parseDouble(input[7]), Integer.parseInt(input[8]));
        Tire tire3 = new Tire(Double.parseDouble(input[9]), Integer.parseInt(input[10]));
        Tire tire4 = new Tire(Double.parseDouble(input[11]), Integer.parseInt(input[12]));

        ArrayList<Tire> tires = new ArrayList<>();
        tires.add(tire1);
        tires.add(tire2);
        tires.add(tire3);
        tires.add(tire4);
        return tires;
    }
}
