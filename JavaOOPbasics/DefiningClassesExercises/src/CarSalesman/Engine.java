package CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine() {

    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getEngineModel() {
        return this.model;
    }
    public int getDisplacement(){
        return this.displacement;
    }
    public String getEfficiency(){
        return this.efficiency;
    }
    public int getPower(){
        return this.power;
    }
}
