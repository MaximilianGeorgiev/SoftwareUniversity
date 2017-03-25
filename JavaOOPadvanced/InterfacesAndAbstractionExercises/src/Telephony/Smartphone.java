package Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Smartphone implements Callable, Searchable {
    private String[] numbers;
    private String[] URLs;

    public Smartphone(String[] numbers, String[] URLs){
        this.numbers = numbers;
        this.URLs = URLs;
    }



    @Override
    public void call() {
        Arrays.stream(this.numbers).forEach(n -> {
            boolean containsDigits = true;

            for (Character character : n.toCharArray()) {
                if (!Character.isDigit(character)){
                    System.out.println("Invalid number!");
                    containsDigits = false;
                    break;
                }
            }
            if (containsDigits) {
                System.out.printf("Calling... %s%n", n);
            }
        });
    }

    @Override
    public void browse() {
        Arrays.stream(this.URLs).forEach(url -> {
            boolean containsDigits = false;

            for (char c : url.toCharArray()) {
                if (Character.isDigit(c)){
                    System.out.println("Invalid URL!");
                    containsDigits = true;
                    break;
                }
            }
            if (!containsDigits) {
                System.out.printf("Browsing: %s!%n", url);
            }
        });
    }
}
