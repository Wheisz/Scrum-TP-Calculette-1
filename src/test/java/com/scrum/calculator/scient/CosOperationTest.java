package com.scrum.calculator.scient;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.scrum.calculator.scient.CosOperation;

public class CosOperationTest {
	@Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Start CosOperatationTest");
    }
	
	 @Test
	    public void testExecute(){
		 Float i = (float) 90.0;
	        
	        ArrayList<Float> listNumber = new ArrayList<Float>();
	        listNumber.add(i);      

	        CosOperation cos = new CosOperation();
	        cos.setListNumber(listNumber);
	        cos.execute();
	        Assert.assertEquals("Add not good",
	                (float)0, cos.getResult(), 0.0);
	    }

	    @After
	    // S'exécute APRES chaque test
	    public void teardown(){
	        System.out.println("End CosOperatationTest");
	    }
}
