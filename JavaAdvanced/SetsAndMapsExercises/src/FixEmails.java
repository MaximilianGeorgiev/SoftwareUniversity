import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String email = "";

        LinkedHashMap<String, String> emailsLog = new LinkedHashMap<>();

        for (int i = 0; i < 500000; i++) {
            if (i % 2 == 0) {
                name = scanner.nextLine();
                if (name.equals("stop")){
                    break;
                }
            } else {
                email = scanner.nextLine();
                emailsLog.put(name, email);
            }
        }

        LinkedHashMap<String, String> validPeople = new LinkedHashMap<>();

        for (Map.Entry<String, String> stringStringEntry : emailsLog.entrySet()) {
            String emailToValidate = stringStringEntry.getValue();

            if (!(emailToValidate.endsWith(".us") || emailToValidate.endsWith(".uk") || emailToValidate.endsWith(".com"))){
                validPeople.put(stringStringEntry.getKey(), stringStringEntry.getValue());
            }

        }
        for (Map.Entry<String, String> stringStringEntry : validPeople.entrySet()) {
            System.out.printf("%s -> %s%n", stringStringEntry.getKey(), stringStringEntry.getValue());
        }
    }}

