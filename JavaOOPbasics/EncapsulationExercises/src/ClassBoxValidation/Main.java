package ClassBoxValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 200sx on 2/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        Box box = new Box();

        try {
            box.setLength(length);
            box.setWidth(width);
            box.setHeight(height);

            System.out.printf("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f%n",
                    box.getSurfaceArea(), box.getLateralSurfaceArea(), box.getVolume());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
