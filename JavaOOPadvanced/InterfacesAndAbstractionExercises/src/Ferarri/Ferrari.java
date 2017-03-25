package Ferarri;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Ferrari implements Car {
    private String driver;

    public Ferrari(String driver){
        this.driver = driver;
    }

    @Override
    public void useBrakes() {

    }

    @Override
    public void useThrottle() {

    }

    @Override
    public String getDriver(){
        return this.driver;
    }

    @Override
    public String toString(){
        return "488-Spider/Brakes!/Zadu6avam sA!/" + this.getDriver();
    }
}
