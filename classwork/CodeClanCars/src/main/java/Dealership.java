
import java.util.ArrayList;

public class Dealership {

    private String name;
    private String location;
    protected CarInventory carInventory;



    public Dealership(String name, String location) {
        this.name = name;
        this.location = location;
        this.carInventory = new CarInventory();
    }

    public String getName() {
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public CarInventory getCarInventory(){
        return this.carInventory;
    }

    public void addCar(Car car) {
        carInventory.addCar(car);
    }

}
