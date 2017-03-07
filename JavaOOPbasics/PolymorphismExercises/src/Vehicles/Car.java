package Vehicles;

/**
 * Created by 200sx on 3/6/2017.
 */
public class Car extends Vehicle {

    public Car(double fuelQuantity, double fuelConsumption){
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void setFuelConsumption(double consumption){
        super.setFuelConsumption(consumption + 0.9);
    }

}
