import java.util.*;
import java.util.stream.Collectors;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Long>> countryAndCities = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();
        String[] input = inputLine.split("\\|");

        while (!input[0].equals("report")){
            String city = input[0];
            String country = input[1];
            long cityPopulation = Long.parseLong(input[2]);

            if (!countryAndCities.containsKey(country)){
                LinkedHashMap<String, Long> cities = new LinkedHashMap<>();
                cities.put(city, cityPopulation);
                countryAndCities.put(country, cities);
            } else {
                LinkedHashMap<String, Long> cities = countryAndCities.get(country);
                if(!cities.containsKey(city)){
                    cities.put(city, cityPopulation);
                } else {
                    long addedPopulation = cities.get(city) + cityPopulation;
                    cities.put(city, addedPopulation);
                }
                countryAndCities.put(country, cities);
            }
            input = scanner.nextLine().split("\\|");
        }
        ArrayList<Map.Entry<String, LinkedHashMap<String, Long>>> countryCitiesOrdered =
                countryAndCities.entrySet().stream()
                        .sorted(Comparator.<Map.Entry<String, LinkedHashMap<String, Long>>>comparingLong
                                (a -> a.getValue().values().stream().mapToLong(b -> b).sum()).reversed())
                        .collect(Collectors.toCollection(ArrayList::new));

        for (Map.Entry<String, LinkedHashMap<String, Long>> pair : countryCitiesOrdered) {

            ArrayList<Map.Entry<String, Long>> cityPopulation = pair.getValue().entrySet().stream()
                    .sorted(Comparator.<Map.Entry<String, Long>>comparingLong(a -> a.getValue()).reversed())
                    .collect(Collectors.toCollection(ArrayList::new));

            long totalPopulation = cityPopulation.stream().mapToLong(a -> a.getValue()).sum();

            System.out.printf("%s (total population: %d)%n", pair.getKey(), totalPopulation);

            for (Map.Entry<String, Long> cityPopulationPair : cityPopulation) {
                System.out.printf("=>%s: %d%n", cityPopulationPair.getKey(), cityPopulationPair.getValue());
            }
        }

    }
}
