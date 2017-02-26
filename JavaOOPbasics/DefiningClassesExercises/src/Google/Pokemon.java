package Google;

/**
 * Created by 200sx on 2/25/2017.
 */
public class Pokemon {
    private String name;
    private String type;

    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
