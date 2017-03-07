package AnimalFarm;

/**
 * Created by 200sx on 2/27/2017.
 */
public class Chicken {
    private String name;
    private int age;

    public Chicken(){
    }

    public void setAge(int age){
        if (age <= 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public void setName(String name){
        if (name.isEmpty() || name.equals(null) || name.length() == 0 || name.equals(" ")){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}
