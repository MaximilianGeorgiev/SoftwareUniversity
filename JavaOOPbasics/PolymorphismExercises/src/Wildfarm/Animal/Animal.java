package Wildfarm.Animal;

import java.text.DecimalFormat;

/**
 * Created by 200sx on 3/7/2017.
 */
public abstract class Animal {
    private String animal;
    private String animalName;
    private String animalRegion;
    private double animalWeight;
    private int foodEaten;

    public Animal(){}

    public Animal(String animal, String animalName, double animalWeight, String animalRegion){
        this.setAnimal(animal);
        this.setAnimalName(animalName);
        this.setAnimalRegion(animalRegion);
        this.setAnimalWeight(animalWeight);
        this.foodEaten = 0;
    }

    protected String getAnimalName() {
        return animalName;
    }

    protected String getAnimalRegion() {
        return animalRegion;
    }

    protected double getAnimalWeight() {
        return animalWeight;
    }

    protected int getFoodEaten(){
        return this.foodEaten;
    }

    protected String getAnimal() {
        return animal;
    }

    private void setAnimal(String animal){
        this.animal = animal;
    }

    private void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    private void setAnimalRegion(String animalType) {
        this.animalRegion = animalType;
    }

    private void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    protected void addToFeedCount(int food){
        this.foodEaten+= food;
    }

    public abstract void makeSound();
    public abstract void eat(String[] food);

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.######");

        return String.format("%s[%s, %s, %s, %d]",
                this.getAnimal(), this.getAnimalName(), format.format(this.getAnimalWeight()), this.getAnimalRegion(), this.getFoodEaten());
    }


}
