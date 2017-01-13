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
public class OddOccurrencesInArrayTest {
    
    public OddOccurrencesInArrayTest() {
    }

    /**
     * Test of solution method, of class OddOccurrencesInArray.
     */
    @Test
    public void testSolution() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        assertEquals(7, o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
    
}
