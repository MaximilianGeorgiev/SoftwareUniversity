package BirthdayCelebrations;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Citizen extends BaseCreature implements Birthable {
    private String name;
    private int age;
    private String id;
    private String birthdate;

    public Citizen(String name, int age, String id, String birthdate){
       super(name);
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthday() {
        return this.birthdate;
    }
}
