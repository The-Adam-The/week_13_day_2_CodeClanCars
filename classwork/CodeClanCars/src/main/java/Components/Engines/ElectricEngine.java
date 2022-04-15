package Components.Engines;


public class ElectricEngine extends  Engine {


    public ElectricEngine(double size, String model){
        super(size, model, EngineType.ELECTRIC);
    }

    @Override
    public String startEngine() {
        return "Vrrmmmm!!!!";
    }



}
