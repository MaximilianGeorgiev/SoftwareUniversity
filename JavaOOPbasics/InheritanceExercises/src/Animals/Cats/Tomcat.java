package Animals.Cats;

/**
 * Created by 200sx on 3/5/2017.
 */
public class Tomcat extends Cat {

    public Tomcat(){}

    public Tomcat(String name, int age, String gender){
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
    }

    @Override
    public void produceSound(){
        System.out.println("Give me one million b***h");
    }

    public void setGender(String gender){
        if (gender.toLowerCase().equals("female")){
            throw new IllegalArgumentException("Invalid input!");
        }
        super.setGender(gender);
    }
}
