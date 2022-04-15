import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {
    Tyres tyres;
    @Before
    public void before() {
        tyres = new Tyres("Michellen", 40, 0.5, 300.00);
    }

    @Test
    public void tyresHasBrand() {
        assertEquals("Michellen", tyres.getBrand());
    }
    @Test
    public void tyresHasRadius(){
        assertEquals(40, tyres.getRadius());
    }

    @Test
    public void tyresHasTreadHeight(){
        assertEquals(0.5, tyres.getTreadHeight(),0.1);
    }

    @Test
    public void tyresHasCost(){
        assertEquals(300, tyres.getCost(), 0.1);
    }
}
