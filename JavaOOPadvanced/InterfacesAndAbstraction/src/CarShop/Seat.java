package CarShop;

import java.io.Serializable;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Seat implements Serializable, Car {
    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    public int getTires() {
        return Car.TIRES;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("This is ").append(this.getModel()).append(" produced in ").append(this.getCountryProduced())
                .append(" and have ").append(this.getTires()).append(" tires");

        return sb.toString();
    }

    public String getCountryProduced() {
        return countryProduced;
    }
}
