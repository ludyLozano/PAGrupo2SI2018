package principal;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ONivia
 */
public class MensajeTest {
    
    public MensajeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testObtenerMensaje() {
        System.out.println("obtenerMensaje");
        Mensaje instance = new Mensaje();
        String expResult = "hola";
        String result = instance.obtenerMensaje();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }    
}
