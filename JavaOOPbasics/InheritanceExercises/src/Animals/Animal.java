package Animals;

/**
 * Created by 200sx on 3/5/2017.
 */
public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(){}

    public Animal (String name, int age, String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0 || name.trim().length() == 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.trim().length() == 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public void produceSound(){
        System.out.println("Not implemented!");
    }
}
