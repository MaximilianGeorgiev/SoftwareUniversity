package CatLady;

/**
 * Created by 200sx on 2/26/2017.
 */
public class StreetExtraordinaire extends Cat {
    private String name;
    private double decibelOfMeows;

    public StreetExtraordinaire(String name, double decibelOfMeows){
        this.name = name;
        this.decibelOfMeows = decibelOfMeows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDecibelOfMeows() {
        return decibelOfMeows;
    }

    public void setDecibelOfMeows(int decibelOfMeows) {
        this.decibelOfMeows = decibelOfMeows;
    }
    @Override
    public String toString(){
        return "StreetExtraordinaire " + this.getName() + " " + String.format("%.0f", this.decibelOfMeows);
    }
}
