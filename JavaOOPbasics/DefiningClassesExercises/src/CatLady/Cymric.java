package CatLady;

/**
 * Created by 200sx on 2/26/2017.
 */
public class Cymric extends Cat {
    private String name;
    private double furLength;

    public Cymric(String name, double furLength){
        this.name = name;
        this.furLength = furLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }
    @Override
    public String toString(){
        return "Cymric " + this.getName() + " " + String.format("%.2f", this.furLength);
    }
}
