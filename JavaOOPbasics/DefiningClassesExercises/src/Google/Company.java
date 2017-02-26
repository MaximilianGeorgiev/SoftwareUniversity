package Google;

/**
 * Created by 200sx on 2/25/2017.
 */
public class Company {
    private String name;
    private String department;
    private double salary;

    public Company(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
