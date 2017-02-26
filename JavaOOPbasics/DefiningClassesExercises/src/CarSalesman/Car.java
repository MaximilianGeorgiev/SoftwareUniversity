package CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private Integer weight;
    private String color;

    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(){

    }

    public void setWeight (int weight){
        this.weight = weight;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getColor(){
        return  this.color;
    }

    public String getModel(){
        return this.model;
    }

}
