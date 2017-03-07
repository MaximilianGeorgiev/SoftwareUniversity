package Wildfarm.Animal;

/**
 * Created by 200sx on 3/7/2017.
 */
public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(){}

    public Mammal (String animal, String name,  double weight, String type){
        super (animal, name, weight, type);
    }



}
