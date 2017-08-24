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
public class BracketsTest {
    
    public BracketsTest() {
    }

    /**
     * Test of solution method, of class Brackets.
     */
    @Test
    public void testSolution() {
        Brackets s = new Brackets();
        assertEquals(1, s.solution("{[()()]}"));
        assertEquals(0, s.solution("([)()]"));
    }
    
}
