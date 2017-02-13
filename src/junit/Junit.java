/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author tud17750
 */


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Junit {

    /**
     * @param args the command line arguments
     */
    date d1=new date(1,1,2015);
    date d2=new date(9,23,2017);
    date d3=new date(9,24,2001);
    
    public static void main(String[] args) {
        System.out.println("Hellow worlld");
        Result result = JUnitCore.runClasses(junit.testJunit.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
        }
        
        
        
    }
    
}
