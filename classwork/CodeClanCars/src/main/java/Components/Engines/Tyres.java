package Components.Engines;

public class Tyres {

  private  String brand;
  private  int radius;
  private  double treadHeight;
  private  double cost;


    public Tyres(String brand, int radius, double treadHeight, double cost) {
        this.brand = brand;
        this.radius = radius;
        this.treadHeight = treadHeight;
        this.cost = cost;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getTreadHeight(){
        return this.treadHeight;
    }

    public double getCost(){
        return this.cost;
    }
}
