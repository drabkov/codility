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
public class PermMissingElemTest {
    
    public PermMissingElemTest() {
    }

    /**
     * Test of solution method, of class PermMissingElem.
     */
    @Test
    public void testSolution() {
        PermMissingElem o = new PermMissingElem();
        assertEquals(4, o.solution(new int[]{2, 3, 1, 5}));
        assertEquals(1, o.solution(new int[]{2}));
        assertEquals(5, o.solution(new int[]{2, 3, 1, 4}));
    }    
}
