package principal;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ONivia
 */
public class OperacionTest {
    
    public OperacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    @Ignore
    public void testSumar() {
        System.out.println("sumar");
        int n1 = 10;
        int n2 = 20;
        Operacion instance = new Operacion();
        int expResult = 40;
        int result = instance.sumar(n1, n2);
        
        if(result == expResult)
            assertTrue(true);
        else
            fail("pailas no son iguales!");
        //assertEquals(expResult, result);
        
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int n1 = 40;
        int n2 = 50;
        Operacion instance = new Operacion();
        int expResult = 10;
        int result = instance.restar(n1, n2);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
