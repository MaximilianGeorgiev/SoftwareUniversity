package SayHello;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Bulgarian extends BasePerson implements Person {
    protected Bulgarian(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
