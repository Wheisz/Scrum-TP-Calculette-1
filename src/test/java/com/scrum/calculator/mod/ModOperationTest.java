package com.scrum.calculator.mod;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.scrum.calculator.modulo.ModOperation;

public class ModOperationTest {
	@Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Start ModOperationTest");
    }
	
	 @Test
	    public void testExecute(){
		 Float i = (float) 10.0;
		 Float j = (float)3;
	        
	        ArrayList<Float> listNumber = new ArrayList<Float>();
	        listNumber.add(i); 
	        listNumber.add(j); 

	        ModOperation mod = new ModOperation();
	        mod.setListNumber(listNumber);
	        mod.execute();
	        Assert.assertEquals("Add not good",
	                (float)1, mod.getResult(), 0.0);
	    }

	    @After
	    // S'exécute APRES chaque test
	    public void teardown(){
	        System.out.println("End ModOperatationTest");
	    }
}
