/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael
 */
public class AirCrackTest {

    public AirCrackTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setCapPath method, of class Aircrack.
     */
    @Test
    public void testAircrack() {
        try {
            Aircrack c = new Aircrack();
            c.setCapPath("Private-02.cap");
            c.setCombinationPath("wordlist_pt_br_final.txt");
            c.startCrack();
            String status = c.getStatus();
            assertEquals(status, "ERROR");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}