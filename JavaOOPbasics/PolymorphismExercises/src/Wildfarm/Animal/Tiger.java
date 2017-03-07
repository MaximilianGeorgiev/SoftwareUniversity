package Wildfarm.Animal;

/**
 * Created by 200sx on 3/7/2017.
 */
public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animal, String name, double weight, String type){
        super(animal, name,weight, type);
    }

    @Override
    public void eat(String[] food){
        if (food[0].equals("Vegetable")){
            throw new IllegalArgumentException(super.getAnimal() + "s are not eating that type of food!");
        }
        super.addToFeedCount(Integer.parseInt(food[1]));
    }

    @Override
    public void makeSound(){
        System.out.println("ROAAR!!!");
    }
}
