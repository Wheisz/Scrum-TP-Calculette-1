package com.scrum.calculator.add;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AddTest {
    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Before test");
    }

    @Test
    public void testAdd(){
        float i = 2;
        float j = 3;
        ArrayList<Float> listNumber = new ArrayList<Float>();
        listNumber.add(i);
        listNumber.add(j);
        int result;
        Add add = new Add();

     //   result = add.execute(listNumber)
    //    Assert.assertEquals("Add not good !", result, 5);
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("After test");
    }
}
