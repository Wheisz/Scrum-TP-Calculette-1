package com.scrum.calculator.scient;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SinOperationTest {
	@Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Start SinOperationTest");
    }
	
	 @Test
	    public void testExecute(){
		 Float i = (float) 90.0;
	        
	        ArrayList<Float> listNumber = new ArrayList<Float>();
	        listNumber.add(i);      

	        SinOperation sin = new SinOperation();
	        sin.setListNumber(listNumber);
	        sin.execute();
	        Assert.assertEquals("Add not good",
	                1, sin.getResult(), 0.0);
	    }

	    @After
	    // S'exécute APRES chaque test
	    public void teardown(){
	        System.out.println("End SinOperationTest");
	    }
}
