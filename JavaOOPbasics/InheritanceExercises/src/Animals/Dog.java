package Animals;

/**
 * Created by 200sx on 3/5/2017.
 */
public class Dog extends Animal {

    public Dog(){}

    public Dog(String name, int age, String gender){
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
    }

    public void produceSound(){
        System.out.println("BauBau");
    }
}
