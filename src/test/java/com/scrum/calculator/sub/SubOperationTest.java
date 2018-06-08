package com.scrum.calculator.sub;

import com.scrum.calculator.add.AddOperation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SubOperationTest {
    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Start SubOperationTest");
    }

    @Test
    public void testSubOperation(){
        float i = 2;
        float j = 3;
        ArrayList<Float> listNumber = new ArrayList<Float>();
        listNumber.add(i);
        listNumber.add(j);

        SubOperation sub = new SubOperation();

        float result = sub.execute(listNumber);
        Assert.assertEquals("Add not good", -1, result, 0.0);
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("End SubOperationTest");
    }
}
