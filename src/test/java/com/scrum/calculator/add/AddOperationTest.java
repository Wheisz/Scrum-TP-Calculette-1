package com.scrum.calculator.add;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AddOperationTest {
    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Start AddOperationTest");
    }

    @Test
    public void testAddOperation(){
        float i = 2;
        float j = 3;
        ArrayList<Float> listNumber = new ArrayList<Float>();
        listNumber.add(i);
        listNumber.add(j);

        AddOperation add = new AddOperation();

        float result = add.execute(listNumber);
        Assert.assertEquals("Add not good", 5, result, 0.0);
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("End AddOperationTest");
    }
}
