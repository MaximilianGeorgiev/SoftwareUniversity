package CustomEnumAnnotations;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class classToInspect = Class.forName("CustomEnumAnnotations.Card" + reader.readLine());

        Custom annotation = (Custom) classToInspect.getDeclaredAnnotation(Custom.class);
        System.out.printf("Type = %s, Description = %s", annotation.type(), annotation.description());
    }
}