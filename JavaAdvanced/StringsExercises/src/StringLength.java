import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLength {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String text = scanner.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(text);

        while (sb.length() < 20){
            sb.append("*");
        }

        System.out.println(sb.toString());
    }
}
