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


public class date {
    int day,year,month;
    
    public date(int d, int m, int y){
        day=d;
        year=y;
        month=m;
    }
    
    public int daysTo(date d2){
        int ret=0;
        ret+=(d2.year-year)*365;
        ret+=(d2.month-month)*30;
        ret+=d2.day-day;
        
        return ret;
    }
    
}
