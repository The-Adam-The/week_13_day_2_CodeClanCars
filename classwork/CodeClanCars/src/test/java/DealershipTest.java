import Components.Engines.PetrolEngine;
import Components.Engines.Tyres;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class DealershipTest {

    Tyres tyres;
    PetrolEngine petrolEngine;
    Car car;

    Dealership dealership;


    @Before
    public void before() {
        tyres = new Tyres("Michellen", 40, 0.5, 300.00);
        petrolEngine = new PetrolEngine(2, "V8");
        car = new Car(petrolEngine, tyres, "red", "Astra", "Vauxhall", 4000);

        dealership = new Dealership("Arnold Clark", "Glasgow");
    }


    @Test
    public void canGetName(){
        assertEquals("Arnold Clark", dealership.getName());
    }

    @Test
    public void canGetLocation() {
        assertEquals("Glasgow", dealership.getLocation());
    }

    @Test
    public void canAddCarToInventory() {
        dealership.addCar(car);
            assertEquals(dealership.carInventory, dealership.getCarInventory());
        }
    }



