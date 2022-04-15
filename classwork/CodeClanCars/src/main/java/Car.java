import Components.Engines.Engine;
import Components.Engines.Tyres;

public class Car {

    Engine engine;
    Tyres tyres;
    String color;
    String model;
    String make;
    double price;


    public Car(Engine engine, Tyres tyres, String color, String model, String make, double price){
        this.engine = engine;
        this.tyres = tyres;
        this.color = color;
        this.model = model;
        this.make = make;
        this.price = price;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Tyres getTyres(){
        return this.tyres;
    }

    public String getColor(){
        return this.color;
    }

    public String getModel(){
        return this.model;
    }

    public String getMake(){
        return this.make;
    }
}
