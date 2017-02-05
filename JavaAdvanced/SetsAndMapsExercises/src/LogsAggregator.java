import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, TreeMap<String, Integer>> log = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String ip = input[0];
            String user = input[1];
            String logTime = input[2];

            if (!log.containsKey(user)){
                TreeMap<String, Integer> ipAndTime = new TreeMap<>();
                ipAndTime.put(ip, Integer.parseInt(logTime));
                log.put(user, ipAndTime);
            } else {
                TreeMap<String, Integer> ipAndTime = log.get(user);

                if (!ipAndTime.containsKey(ip)){
                    ipAndTime.put(ip, Integer.parseInt(logTime));
                } else {
                    int currentLogTime = ipAndTime.get(ip);

                    ipAndTime.put(ip, currentLogTime + Integer.parseInt(logTime));
                }

            }
        }
        for (Map.Entry<String, TreeMap<String, Integer>> user : log.entrySet()) {
            TreeMap<String, Integer> ipAndTime = user.getValue();
            int totalUserLogTime = 0;

            ArrayList<String> ips = new ArrayList<>();

            for (Map.Entry<String, Integer> ipsAndTime : ipAndTime.entrySet()) {
                totalUserLogTime += ipsAndTime.getValue();
            }
            System.out.printf("%s: %d ", user.getKey(), totalUserLogTime);

            for (Map.Entry<String, Integer> ip : ipAndTime.entrySet()) {
                ips.add(ip.getKey().toString());
            }
            System.out.printf("[%s]%n", String.join(", ", ips));
        }
    }
}
