package CodingTracker;

import java.lang.reflect.Method;
import java.text.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 200sx on 4/12/2017.
 */

public class Tracker {
    @Author(name = "Pesho")
    public static void printMethodsByAuthor() {
        Map<String, List<String>> authorMethods = new HashMap<>();

        Method[] methods = Tracker.class.getDeclaredMethods();

        for (Method method : methods) {
            Author author = method.getAnnotation(Author.class);

            authorMethods.putIfAbsent(author.name(), new ArrayList<>());
            authorMethods.get(author.name()).add(method.getName());
        }

        for (Map.Entry<String, List<String>> pair : authorMethods.entrySet()) {
            System.out.printf("%s: %s%n", pair.getKey(), String.join(", ", pair.getValue()));
        }
    }
}

