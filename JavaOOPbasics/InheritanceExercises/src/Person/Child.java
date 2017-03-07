package Person;

/**
 * Created by 200sx on 3/4/2017.
 */
public class Child extends Person {

    public Child(String name, int age){
       super (name, age);
    }

    @Override
    protected void setAge(int age){
        if (age > 15){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge()));

        return sb.toString();
    }

}
