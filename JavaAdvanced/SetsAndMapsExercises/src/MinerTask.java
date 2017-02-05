import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String material = " ";
        long quantity = 0L;
        LinkedHashMap<String, Long> yield = new LinkedHashMap<>();

        for (int i = 0; i < 500000; i++) {
            if (i % 2 == 0){
                material = scanner.nextLine();
                if (material.equals("stop")){
                    for (Map.Entry<String, Long> stringLongEntry : yield.entrySet()) {
                        System.out.printf("%s -> %d%n", stringLongEntry.getKey(), stringLongEntry.getValue());
                    }
                    return;
                }
            } else {
                quantity = Long.parseLong(scanner.nextLine());

                if (!yield.containsKey(material)){
                    yield.put(material, quantity);
                } else {
                    long currentYield = yield.get(material) + quantity;
                    yield.put(material, currentYield);
                }
            }
        }
    }
}
