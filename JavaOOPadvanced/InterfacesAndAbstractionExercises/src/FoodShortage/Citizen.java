package FoodShortage;


/**
 * Created by 200sx on 3/23/2017.
 */
public class Citizen implements Buyer{
    private String name;
    private int age;
    private String id;
    private String birthdate;
    private int food;


    public Citizen(String name, int age, String id, String birthdate){
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
        this.food = 0;
    }

    @Override
    public int getFood(){
        return this.food;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }
}
