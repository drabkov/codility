/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author drabkov
 */
public class TapeEquilibriumTest {
    
    public TapeEquilibriumTest() {
    }

    /**
     * Test of solution method, of class TapeEquilibrium.
     */
    @Test
    public void testSolution() {
        TapeEquilibrium o = new TapeEquilibrium();
        assertEquals(1, o.solution(new int[]{3, 1, 2, 4, 3}));
    }
    
}
