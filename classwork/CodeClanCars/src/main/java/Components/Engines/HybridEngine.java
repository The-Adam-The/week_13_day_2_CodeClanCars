package Components.Engines;

public class HybridEngine extends Engine{
    public HybridEngine(double size, String model) {
        super(size, model, EngineType.HYBRID);
    }

    @Override
    public String startEngine() {
        return "BrrrrrVrrmm!!!!";
    }
}
