import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> carLot = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toCollection(ArrayList::new));

        String command = scanner.nextLine();
        int soldVehicles = 0;

        while(!command.equals("End of customers!")){
            char vehicleType = command.split(" ")[0].toLowerCase().charAt(0);
            int seatsCount = Integer.parseInt(command.split(" ")[2]);

            String searchedVehicle = vehicleType + String.valueOf(seatsCount);

            if (carLot.contains(searchedVehicle)){
                carLot.remove(searchedVehicle);
                soldVehicles++;
                int sellPrice = Character.valueOf(vehicleType) * seatsCount;

                System.out.printf("Yes, sold for %d$%n", sellPrice);
            } else {
                System.out.println("No");
            }
            command = scanner.nextLine();
        }
        String output = String.join(", ", carLot);
        System.out.printf("Vehicles left: %s", output);
        System.out.printf("%nVehicles sold: %d", soldVehicles);
    }
}
