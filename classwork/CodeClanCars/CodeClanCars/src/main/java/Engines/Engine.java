package Engines;

public abstract class Engine {

    private double size;
    private String model;
    private EngineType fuelType;

    public Engine(double size, String model, EngineType fuelType){
        this.size = size;
        this.model = model;
        this.fuelType = fuelType;
    }

    public double getSize(){
        return this.size;
    }

    public String getModel() {
        return this.model;
    }

    public EngineType getFuelType() {
        return this.fuelType;
    }

    public String startEngine() {
        return "Brrrrr!!!!";
    }

    public String turnOffEngine(){
        return "***Silence***";
    }

}
