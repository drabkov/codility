/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author drabkov
 */
public class CyclicRotationTest {
    
    public CyclicRotationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of solution method, of class CyclicRotation.
     */
    @Test
    public void testSolution() {
        CyclicRotation cr = new CyclicRotation();
        Assert.assertArrayEquals(new int[] {9, 7, 6, 3, 8}, cr.solution(new int[] {3, 8, 9, 7, 6}, 3));
    }
    
}
