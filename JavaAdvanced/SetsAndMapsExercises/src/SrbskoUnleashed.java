import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SrbskoUnleashed {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        Pattern p = Pattern.compile("((?:[A-Za-z]+ ){1,3})@((?:[A-Za-z]+ ){1,3})([0-9]+) ([0-9]+)");

        LinkedHashMap<String, LinkedHashMap<String, Integer>> placesAndSingers = new LinkedHashMap<>();

        String command = scanner.readLine();

        while (!command.equals("End")){

            Matcher m = p.matcher(command);

            if(!m.matches()){
                command = scanner.readLine();
                continue;
            }

            String singer = m.group(1).trim();
            String venue = m.group(2).trim();

            int ticketPrice = Integer.parseInt(m.group(3));
            int ticketCount = Integer.parseInt(m.group(4));
            int profit = ticketCount * ticketPrice;

            if (!placesAndSingers.containsKey(venue)){
                LinkedHashMap<String, Integer> singerAndProfit = new LinkedHashMap<>();
                singerAndProfit.put(singer, profit);
                placesAndSingers.put(venue, singerAndProfit);
            } else {
                LinkedHashMap<String, Integer> singerAndProfit = placesAndSingers.get(venue);

                if (!singerAndProfit.containsKey(singer)){
                    singerAndProfit.put(singer, profit);
                    placesAndSingers.put(venue, singerAndProfit);
                } else {
                    singerAndProfit.put(singer, singerAndProfit.get(singer) + profit);
                    placesAndSingers.put(venue, singerAndProfit);
                }
            }
            command = scanner.readLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> venues : placesAndSingers.entrySet()) {
            System.out.printf("%s%n", venues.getKey());

            venues.getValue().entrySet().stream().sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                    .forEach(a -> System.out.printf("#  %s -> %d%n", a.getKey(), a.getValue()));
        }
    }
}
