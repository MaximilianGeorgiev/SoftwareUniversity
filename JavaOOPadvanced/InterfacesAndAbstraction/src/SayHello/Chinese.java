package SayHello;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Chinese extends BasePerson implements Person {

    public Chinese(String name){
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}