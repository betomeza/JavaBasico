package clase6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicacionTest {
    
    public MultiplicacionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("setUpClass...");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("tearDownClass...");
    }

    @Before
    public void setUp() {
        System.out.println("setUp...");
    }

    @After
    public void tearDown() {
         System.out.println("tearDown...");
    }

    @Test
    public void testMultiplication() {
        assertEquals("Multiplication", 6, 3 * 2);
    }
}