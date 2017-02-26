package CatLady;

/**
 * Created by 200sx on 2/26/2017.
 */
public class SiameseBreed extends Cat {
    private String name;
    private double earSize;

    public SiameseBreed(String name, double earSize){
        this.name = name;
        this.earSize = earSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEarSize() {
        return earSize;
    }

    public void setEarSize(int earSize) {
        this.earSize = earSize;
    }
    @Override
    public String toString(){
        return "Siamese " + this.getName() + " " + String.format("%.0f", this.earSize);
    }
}
