package BirthdayCelebrations;

/**
 * Created by 200sx on 3/23/2017.
 */
public class Pet extends BaseCreature implements Birthable {
    private String name;
    private String birthdate;

    public Pet(String name, String birthdate){
        super(name);
        this.birthdate = birthdate;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getBirthday() {
        return this.birthdate;
    }
}
