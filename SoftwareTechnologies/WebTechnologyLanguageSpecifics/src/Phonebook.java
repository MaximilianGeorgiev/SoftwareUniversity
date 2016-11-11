import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        String[] input = inputScanner.nextLine().split(" ");

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();


        while (!input[0].equals("END")) {

            if (input[0].equals("A")) {
                String name = input[1];
                String number = input[2];

                phonebook.put(name, number);
            }

            else if (input[0].equals("S")) {
                String name = input[1];

                if (phonebook.containsKey(name)) {

                    System.out.println(name + " -> " + phonebook.get(name));

                } else {
                    System.out.println("Contact " + name + " does not exist.");

                }

            }

            input = inputScanner.nextLine().split(" ");

        }
    }
}


