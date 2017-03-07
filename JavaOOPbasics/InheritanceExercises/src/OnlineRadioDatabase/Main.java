package OnlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Created by 200sx on 3/5/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(scanner.readLine());

        ArrayList<Song> playList = new ArrayList<>();
        LocalTime totalDuration = LocalTime.of(0, 0, 0);

        int songsCount = 0;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.readLine().split(";");

            if (input.length != 3) {
                System.out.println("Invalid song.");
                continue;
            }

            String[] lengthArgs = input[2].split(":");

            if (lengthArgs.length != 2) {
                System.out.println("Invalid song length.");
                continue;
            }

            int minutes = Integer.parseInt(lengthArgs[0]);
            int seconds = Integer.parseInt(lengthArgs[1]);

            Song song = new Song();

            try {
                song = new Song(input[0], input[1], minutes, seconds);

            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                continue;
            }
            playList.add(song);
            totalDuration = totalDuration.plusMinutes(song.getMinutes());
            totalDuration = totalDuration.plusSeconds(song.getSeconds());

            System.out.println("Song added.");
            songsCount++;
        }

        System.out.printf("Songs added: %d%n", songsCount);
        System.out.printf("Playlist length: %dh %dm %ds", totalDuration.getHour(), totalDuration.getMinute(), totalDuration.getSecond());
    }
}
