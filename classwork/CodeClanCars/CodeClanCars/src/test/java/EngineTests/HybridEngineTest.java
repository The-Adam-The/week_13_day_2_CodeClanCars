package EngineTests;

import Engines.ElectricEngine;
import Engines.Engine;
import Engines.EngineType;
import Engines.HybridEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridEngineTest {

    HybridEngine hybridEngine;

    @Before
    public void before() {
        hybridEngine = new HybridEngine(2.1, "combo e-p");
    }

    @Test
    public void hasSize(){
        assertEquals(2.1, hybridEngine.getSize(), 0.1);
    }

    @Test public void hasModel(){
        assertEquals("combo e-p", hybridEngine.getModel());
    }

    @Test
    public void hasFuelType(){
        assertEquals(EngineType.HYBRID, hybridEngine.getFuelType());
    }

    @Test
    public void canBeStarted(){
        assertEquals("BrrrrrVrrmm!!!!", hybridEngine.startEngine());
    }

    @Test
    public void canBeTurnedOff(){
        assertEquals("***Silence***", hybridEngine.turnOffEngine());
    }
}


