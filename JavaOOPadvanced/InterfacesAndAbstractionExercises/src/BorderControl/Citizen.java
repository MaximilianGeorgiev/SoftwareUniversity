package BorderControl;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Citizen extends BaseIntruder {
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public String getId() {
        return this.id;
    }
}
