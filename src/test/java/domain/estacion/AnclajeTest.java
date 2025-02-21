package domain.estacion;

import domain.bicicleta.Bicicleta;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnclajeTest {

    private Anclaje anclaje;
    private Bicicleta bicicleta;

    @Before
    public void setup() {
        anclaje = new Anclaje();
        bicicleta = new Bicicleta(101);
    }

    @Test
    public void test_constructorAnclaje() {
        assertFalse(anclaje.isOcupado());
        assertNull(anclaje.getBicicleta());
    }

    @Test
    public void test_isOcupado() {
        assertFalse(anclaje.isOcupado());
        anclaje.anclarBicicleta(bicicleta);
        assertTrue(anclaje.isOcupado());
    }

    @Test
    public void test_getBicicleta() {
        assertNull(anclaje.getBicicleta());
        anclaje.anclarBicicleta(bicicleta);
        assertEquals(bicicleta, anclaje.getBicicleta());
    }

    @Test
    public void test_AnclarBicicleta() {
        anclaje.anclarBicicleta(bicicleta);
        assertTrue(anclaje.isOcupado());
        assertEquals(bicicleta, anclaje.getBicicleta());
    }

    @Test
    public void test_LiberarBicicleta() {
        anclaje.liberarBicicleta(bicicleta);
        assertFalse(anclaje.isOcupado());
        assertNull(anclaje.getBicicleta());
    }

    @Test
    public void test_ToString() {
        String expected = "Ocupado:false";
        assertEquals(expected, anclaje.toString());

        anclaje.anclarBicicleta(bicicleta);
        expected = "Ocupado:true";
        assertEquals(expected, anclaje.toString());
    }
}
