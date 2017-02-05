import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, HashSet<String>> playersAndDecks = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] playerAndDeck = input.split(": ");
            String player = playerAndDeck[0];
            String[] deckCards = playerAndDeck[1].split(", ");

            HashSet<String> deck = new HashSet<>();


            for (int i = 0; i < deckCards.length; i++) {
                deck.add(deckCards[i]);
            }

            if (!playersAndDecks.containsKey(player)) {
                playersAndDecks.put(player, deck);
            } else {
                if (deck.size() == 0) {
                    continue;
                }

                HashSet<String> currentDeck = playersAndDecks.get(player);
                for (String s : deck) {
                    currentDeck.add(s);
                }
                playersAndDecks.put(player, currentDeck);
            }

            input = scanner.nextLine();
        }
        long sum = 0L;

        for (Map.Entry<String, HashSet<String>> player : playersAndDecks.entrySet()) {
            for (String card : player.getValue()) {
                String power = card.substring(0, card.length() - 1);
                String type = Character.toString(card.charAt(card.length() - 1));

                long typeValue = 0;
                long powerValue = 0;

                switch(power){
                    case "J":
                        powerValue = 11;
                        break;
                    case "Q":
                        powerValue = 12;
                        break;
                    case "K":
                        powerValue = 13;
                        break;
                    case "A":
                        powerValue = 14;
                        break;
                    default:
                        powerValue = Long.valueOf(power);
                        break;
                }

                switch(type){
                    case "S":
                        typeValue = 4;
                        break;
                    case "H":
                        typeValue = 3;
                        break;
                    case "D":
                        typeValue = 2;
                        break;
                    case "C":
                        typeValue = 1;
                        break;
                }
                sum += powerValue * typeValue;
            }
            System.out.printf("%s: %d%n", player.getKey(), sum);
            sum = 0L;
        }
    }
}
