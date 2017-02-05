import java.util.*;
import java.util.stream.Collectors;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> log = new TreeMap<>();

        String[] input = scanner.nextLine().split("=");

        while (!input[0].equals("end")) {
            String ip = input[1].split(" ")[0];

            String message = input[2].split(" ")[0];
            String user = input[3];

            if (message.isEmpty() || message.equals(null)) {
                continue;
            }

            if (!log.containsKey(user)) {
                LinkedHashMap<String, Integer> IPsAndMessages = new LinkedHashMap<>();
                IPsAndMessages.put(ip, 1);
                log.put(user, IPsAndMessages);
            } else {
                LinkedHashMap<String, Integer> IPsAndMessages = log.get(user);

                if (IPsAndMessages.containsKey(ip)) {
                    int messages = IPsAndMessages.get(ip);
                    messages++;
                    IPsAndMessages.put(ip, messages);
                } else {
                    IPsAndMessages.put(ip, 1);
                }
                log.put(user, IPsAndMessages);
            }

            input = scanner.nextLine().split("=");
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : log.entrySet()) {
            System.out.printf("%s: %n", user.getKey());

            ArrayList<Map.Entry<String, Integer>> userIpAsList = log.get(user.getKey()).entrySet().stream()
                    .collect(Collectors.toCollection(ArrayList::new));

            for (Map.Entry<String, Integer> ipAndCount : userIpAsList) {
                if (!ipAndCount.equals(userIpAsList.get(userIpAsList.size() - 1))) {
                    System.out.printf("%s => %d, ", ipAndCount.getKey(), ipAndCount.getValue());
                } else {
                    System.out.printf("%s => %d.%n", ipAndCount.getKey(), ipAndCount.getValue());
                }
            }
        }
    }
}
