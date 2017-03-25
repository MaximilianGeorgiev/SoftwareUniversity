package BirthdayCelebrations;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Robot extends BaseCreature implements Birthable {
    private String model;
    private String id;

    public Robot(String model, String id) {
        super(model);
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthday() {
        return "-1";
    }

}
