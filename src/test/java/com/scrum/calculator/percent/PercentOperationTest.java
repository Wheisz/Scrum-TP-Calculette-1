package com.scrum.calculator.percent;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PercentOperationTest {
    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Start PercentOperationTest");
    }
	
	 @Test
    public void testExecute(){
	     Float i = (float) 15.0;
	     	        
	        ArrayList<Float> listNumber = new ArrayList<Float>();
	        listNumber.add(i); 
	       
	        PercentOperation perc = new PercentOperation();
	        perc.setListNumber(listNumber);
	        perc.execute();
	        Assert.assertEquals("Add not good",
	                (float)0.15, perc.getResult(), 0.0);
	    }

	    @After
	    // S'exécute APRES chaque test
	    public void teardown(){
	        System.out.println("End PercentOperationTest");
	    }
}
