/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author drabkov
 */
public class BinaryGapTest {
    
    public BinaryGapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of solution method, of class BinaryGap.
     */
    @Test
    public void testSolution() {
        BinaryGap bg = new BinaryGap();
        assertEquals(5, bg.solution(1041));
    }
    
}
