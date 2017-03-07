package Animals.Cats;

import Animals.Animal;

/**
 * Created by 200sx on 3/5/2017.
 */
public class Cat extends Animal {

    public Cat(){}


    public Cat(String name, int age, String gender){
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
    }

    public void produceSound(){
        System.out.println("MiauMiau");
    }

    public void setGender(String gender){
        if (gender.toLowerCase().equals("male")){
            throw new IllegalArgumentException("Invalid input!");
        }
        super.setGender(gender);
    }
}
