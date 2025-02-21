package domain.bicicleta;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BicicletaTest {

    private static Bicicleta bicicleta = null;

    @Before
    public void setup_bicicleta() {
        bicicleta = new Bicicleta(101);
    }
    @Test
    public void test_constructorBicicleta() {

        int idExpected = 101;
        int id = bicicleta.getId();
        assertEquals(idExpected, id);
    }

    @Test
    public void test_toString() {

        String id = "101";
        String representacionId = bicicleta.toString();
        assertEquals(id, representacionId);
    }
}
