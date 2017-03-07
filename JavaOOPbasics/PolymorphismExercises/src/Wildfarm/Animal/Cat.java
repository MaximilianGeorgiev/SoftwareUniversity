package Wildfarm.Animal;

import java.text.DecimalFormat;

/**
 * Created by 200sx on 3/7/2017.
 */
public class Cat extends Felime {
    private String breed;

    public Cat(){}

    public Cat(String animal, String name,  double weight, String type, String breed){
        super(animal, name, weight, type);
        this.breed = breed;
    }


    private String getBreed(){
        return this.breed;
    }

    @Override
    public void makeSound(){
        System.out.println("Meowwww");
    }

    @Override
    public void eat(String[] food){
        super.addToFeedCount(Integer.parseInt(food[1]));
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.######");

        return String.format("Cat[%s, %s, %s, %s, %d]",
                super.getAnimalName(), this.getBreed(), format.format(this.getAnimalWeight()), this.getAnimalRegion(), this.getFoodEaten());
    }
}
