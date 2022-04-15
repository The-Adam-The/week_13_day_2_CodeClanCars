package EngineTests;

import Engines.ElectricEngine;
import Engines.Engine;
import Engines.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ElectricEngineTest {

    Engine electricEngine;

    @Before
    public void before() {
        electricEngine = new ElectricEngine(2.5, "Edison V");
    }

    @Test
    public void hasSize(){
        assertEquals(2.5, electricEngine.getSize(), 0.1);
    }

    @Test public void hasModel(){
        assertEquals("Edison V", electricEngine.getModel());
    }

    @Test
    public void hasFuelType(){
        assertEquals(EngineType.ELECTRIC, electricEngine.getFuelType());
    }

    @Test
    public void canBeStarted(){
        assertEquals("Vrrmmmm!!!!", electricEngine.startEngine());
    }

    @Test
    public void canBeTurnedOff(){
        assertEquals("***Silence***", electricEngine.turnOffEngine());
    }
}
