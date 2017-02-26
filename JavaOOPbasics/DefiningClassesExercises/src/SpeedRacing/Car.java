package SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private double distanceTravelled;

    public Car(String model, double fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distanceTravelled = 0;
    }

    public String getModel(){
        return this.model;
    }

    public double getFuelAmount(){
        return this.fuelAmount;
    }

    public double getFuelCostPerKm(){
        return this.fuelCostPerKm;
    }

    public double getDistanceTravelled(){
        return this.distanceTravelled;
    }

    public boolean canDriveDistance(double distance){
        if (this.fuelCostPerKm * distance <= this.fuelAmount){
            this.fuelAmount -= this.fuelCostPerKm * distance;
            this.distanceTravelled += distance;
            return true;
        }
        return false;
    }
}
