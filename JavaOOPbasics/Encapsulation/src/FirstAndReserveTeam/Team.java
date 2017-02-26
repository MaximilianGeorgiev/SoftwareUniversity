package FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 200sx on 2/26/2017.
 */
public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name){
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public void addPlayer(Person player){
        if (player.getAge() > 40) {
            this.reserveTeam.add(player);
        }  else {
            this.firstTeam.add(player);
        }
    }

    public List<Person> getFirstTeam(){
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam(){
        return Collections.unmodifiableList(this.reserveTeam);
    }
}
