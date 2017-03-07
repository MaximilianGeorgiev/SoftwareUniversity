package OnlineRadioDatabase;

import java.time.LocalTime;

/**
 * Created by 200sx on 3/5/2017.
 */
public class Song {
    private String artist;
    private String name;
    private int minutes;
    private int seconds;
    private LocalTime totalLength;

    public Song(){}

    public Song(String artist, String name, int minutes, int seconds){
        this.setArtist(artist);
        this.setName(name);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    private void setArtist(String artist){
        if (artist.trim().length() < 3 || artist.trim().length() > 20){
            throw new IllegalArgumentException("Artist name should be between 3 and 20 symbols.");
        }
        this.artist = artist;
    }

    private void setName(String name){
        if (name.trim().length() < 3 || artist.trim().length() > 20){
            throw new IllegalArgumentException("Song name should be between 3 and 30 symbols.");
        }
        this.name = name;
    }

    private void setMinutes(int minutes){
        if (minutes < 0 || minutes > 14){
            throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
        }
        this.minutes = minutes;
    }
    private void setSeconds(int seconds){
        if (seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
        }
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
