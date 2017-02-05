import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        HashMap<String, Integer> keyMaterials = new HashMap<>();
        TreeMap<String, Integer> junkItems = new TreeMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean hasBeenFound = false;

        String foundItem = null;

        while (true) {
            String[] inputArgs = console.nextLine().split(" ");

            for (int i = 0; i < inputArgs.length - 1; i += 2) {
                int itemCount = Integer.parseInt(inputArgs[i]);
                String item = inputArgs[i + 1].toLowerCase();

                if (item.equals("shards") || item.equals("fragments") || item.equals("motes")) {
                    keyMaterials.put(item, keyMaterials.get(item) + itemCount);
                } else {
                    if (!junkItems.containsKey(item)) {
                        junkItems.put(item, itemCount);
                    } else {
                        junkItems.put(item, junkItems.get(item) + itemCount);
                    }
                }

                if (keyMaterials.get("shards") >= 250) {
                    foundItem = "shards";
                    keyMaterials.put(foundItem, keyMaterials.get(foundItem) - 250);

                    hasBeenFound = true;
                    break;
                } else if (keyMaterials.get("fragments") >= 250) {
                    foundItem = "fragments";
                    keyMaterials.put(foundItem, keyMaterials.get(foundItem) - 250);

                    hasBeenFound = true;
                    break;
                } else if (keyMaterials.get("motes") >= 250) {
                    foundItem = "motes";
                    keyMaterials.put(foundItem, keyMaterials.get(foundItem) - 250);

                    hasBeenFound = true;
                    break;
                }
            }

            if (hasBeenFound) {
                break;
            }
        }

        if (foundItem.equals("shards")) {
            System.out.println("Shadowmourne obtained!");
        } else if (foundItem.equals("fragments")) {
            System.out.println("Valanyr obtained!");
        } else {
            System.out.println("Dragonwrath obtained!");
        }

        keyMaterials.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(a -> a.getValue())
                        .reversed()
                        .thenComparing(a -> a.getKey()))
                .forEach(a -> System.out.printf("%s: %d%n", a.getKey(), a.getValue()));

        for (String item : junkItems.keySet()) {
            System.out.printf("%s: %d%n", item, junkItems.get(item));
        }
    }
}