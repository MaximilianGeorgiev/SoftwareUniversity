import javax.security.sasl.SaslClient;
import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> parkingLot = new HashSet<>();

        String[] input = scanner.nextLine().split(", ");

        while (!input[0].equals("END")) {
            if(input[0].equals("IN")){
                parkingLot.add(input[1]);
            } else {
                parkingLot.remove(input[1]);
            }
            input = scanner.nextLine().split(", ");
        }

        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
            return;
        }
        for (String s : parkingLot) {
            System.out.println(s);
        }
    }
}
