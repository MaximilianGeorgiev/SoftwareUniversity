package Vehicles;

/**
 * Created by 200sx on 3/6/2017.
 */
public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void addFuel(double quantity) {
        super.addFuel(quantity * 0.95);
    }

    @Override
    protected void setFuelConsumption(double consumption){
        super.setFuelConsumption(consumption + 1.6);
    }
}
