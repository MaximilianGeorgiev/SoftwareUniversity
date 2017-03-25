package BorderControl;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Robot extends BaseIntruder {
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

}
