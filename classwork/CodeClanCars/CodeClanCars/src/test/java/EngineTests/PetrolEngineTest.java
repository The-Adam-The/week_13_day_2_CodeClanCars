package EngineTests;

import Engines.Engine;
import Engines.EngineType;
import Engines.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PetrolEngineTest {

    Engine petrolEngine;

    @Before
    public void before() {
        petrolEngine = new PetrolEngine(2, "V8");
    }

    @Test
    public void hasSize(){
        assertEquals(2, petrolEngine.getSize(), 0.1);
    }

    @Test public void hasModel(){
        assertEquals("V8", petrolEngine.getModel());
    }

    @Test
    public void hasFuelType(){
        assertEquals(EngineType.PETROL, petrolEngine.getFuelType());
    }

    @Test
    public void canBeStarted(){
        assertEquals("Brrrrr!!!!", petrolEngine.startEngine());
    }

    @Test
    public void canBeTurnedOff(){
        assertEquals("***Silence***", petrolEngine.turnOffEngine());
    }
}
