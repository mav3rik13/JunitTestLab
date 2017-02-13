package junit;


import junit.date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tud17750
 */
public class testJunit {
    static date d1=new date(1,9,2017);
    static date d2=new date(23,9,2017);
    static date d3=new date(24,9,2017);
    
    @Test
    public void test() {
        assertEquals(22, d1.daysTo(d2));
        assertEquals(23, d1.daysTo(d3));
        assertEquals(1, d2.daysTo(d3));
        
    }
    
}
