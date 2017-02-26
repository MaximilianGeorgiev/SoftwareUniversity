package Google;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 200sx on 2/25/2017.
 */
public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parents;
    private List<Children> children;
    private List<Pokemon> pokemons;

    public Person(){
        this.name = "";
        this.parents = new ArrayList<Parent>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar(){
        return this.car;
    }

    public void setCar(Car car){
        this.car = car;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    public List<Children> getChildren() {
        return children;
    }

    public void addChildren(Children children) {
        this.children.add(children);
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append(this.getName()).append("\r\n");

        out.append("Company:").append("\r\n");
        if (this.company != null) {
            out.append(String.format("%s %s %.2f%n",
                    this.getCompany().getName(), this.company.getDepartment(), this.company.getSalary()));
        }

        out.append("Car:").append("\r\n");
        if (this.car != null) {
            out.append(String.format("%s %d%n", this.getCar().getModel(), this.getCar().getSpeed()));
        }

        out.append("Pokemon:").append("\r\n");
        for (Pokemon pokemon : this.getPokemons()) {
            out.append(String.format("%s %s%n", pokemon.getName(), pokemon.getType()));
        }

        out.append("Parents:").append("\r\n");
        for (Parent parent : this.getParents()) {
            out.append(String.format("%s %s%n", parent.getName(), parent.getBirthday()));
        }

        out.append("Children:").append("\r\n");
        for (Children child : this.getChildren()) {
            out.append(String.format("%s %s%n", child.getName(), child.getBirthday()));
        }

        return out.toString();
    }
}
