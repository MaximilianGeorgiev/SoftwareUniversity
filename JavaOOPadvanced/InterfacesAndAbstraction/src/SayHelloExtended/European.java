package SayHelloExtended;

/**
 * Created by 200sx on 3/18/2017.
 */
public class European extends BasePerson implements Person {
    protected European(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
