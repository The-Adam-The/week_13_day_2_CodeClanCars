import Engines.Engine;
import Engines.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {


    Tyres tyres;
    PetrolEngine petrolEngine;
    Car car;

    @Before
    public void before(){
        tyres = new Tyres("Michellen", 40, 0.5, 300.00);
        petrolEngine = new PetrolEngine(2, "V8");
        car = new Car(petrolEngine, tyres, "red", "Astra", "Vauxhall");
    }

    @Test
    public void carHasEngine(){
        assertEquals(petrolEngine, car.getEngine());
    }

    @Test
    public void carHasTyres(){
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void carHasColor(){
        assertEquals("red", car.getColor());
    }

    @Test
    public void carHasModel(){
        assertEquals("Astra", car.getModel());
    }

    @Test
    public void carHasMake(){
        assertEquals("Vauxhall", car.getMake());
    }

}
