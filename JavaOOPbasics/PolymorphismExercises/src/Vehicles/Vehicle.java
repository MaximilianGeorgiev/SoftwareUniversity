package Vehicles;

import java.text.DecimalFormat;

/**
 * Created by 200sx on 3/6/2017.
 */
public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;


    public Vehicle() {
    }

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
    }


    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected void addFuel(double quantity) {
        this.fuelQuantity += quantity;
    }

    protected void burnFuel(double quantity) {
        this.fuelQuantity -= quantity;
    }

    public void getFuelQuantity() {
        DecimalFormat format = new DecimalFormat("0.######");
        System.out.printf("%.2f", Double.parseDouble(format.format(this.fuelQuantity)));
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void drive(double distance) {
        if (this.getFuelConsumption() * distance >= this.fuelQuantity) {
            throw new IllegalArgumentException("needs refueling");
        }
        this.burnFuel(this.getFuelConsumption() * distance);
    }

}
