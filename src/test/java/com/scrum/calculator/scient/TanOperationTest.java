package com.scrum.calculator.scient;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.scrum.calculator.scient.TanOperation;

public class TanOperationTest {
	@Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Start TanOperationTest");
    }
	
	 @Test
	    public void testExecute(){
		 Float i = (float) 45.0;
	        
	        ArrayList<Float> listNumber = new ArrayList<Float>();
	        listNumber.add(i);      

	        TanOperation tan = new TanOperation();
	        tan.setListNumber(listNumber);
	        tan.execute();
//	        Assert.assertEquals("Add not good",
//	                1, tan.getResult(), 0.0);
	    }

	    @After
	    // S'exécute APRES chaque test
	    public void teardown(){
	        System.out.println("End TanOperatationTest");
	    }
}
