package SayHelloExtended;

/**
 * Created by 200sx on 3/18/2017.
 */
public abstract class BasePerson {
    private String name;

    protected BasePerson(String name){
        this.setName(name);

    }

    private void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }
}
