import java.util.ArrayList;

public class CarInventory {

    private ArrayList<Car> carInventory;

    public CarInventory(){
        this.carInventory = new ArrayList<Car>();
    }

    //Create an add function


    public void addCar(Car car){
        this.carInventory.add(car);
    }
}
