package FoodShortage;

/**
 * Created by 200sx on 3/23/2017.
 */
public class Rebel implements Buyer{
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getFood(){
        return this.food;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }
}
