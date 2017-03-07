package Animals.Cats;

/**
 * Created by 200sx on 3/5/2017.
 */
public class Kitten extends Cat {

    public Kitten(){}

    public Kitten(String name, int age, String gender){
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
    }

    @Override
    public void produceSound(){
        System.out.println("Miau");
    }

    public void setGender(String gender){
        if (gender.toLowerCase().equals("male")){
            throw new IllegalArgumentException("Invalid input!");
        }
        super.setGender(gender);
    }
}
