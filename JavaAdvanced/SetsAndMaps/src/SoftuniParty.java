import java.util.*;

public class SoftuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> invitesList = new HashSet<>();
        LinkedHashSet<String> participants = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            invitesList.add(input);
            input = scanner.nextLine();
        }
        while (!input.equals("END")) {

            if (invitesList.contains(input)) {
                participants.add(input);
            }
            input = scanner.nextLine();
        }
        Set<String> didntCome = new TreeSet();

        for (String person : invitesList) {
            if (!participants.contains(person)){
                didntCome.add(person);
            }
        }
        System.out.println(didntCome.size());

        for (String person : didntCome) {
            System.out.println(person);
        }
    }
}
