/*
 *  Copyright 2018 - Ida Willy Théodore - M2 - IIA Laval
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.scrum.calculator.testoperations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.scrum.calculator.operations.DivideOperation;

import java.util.ArrayList;

public class DivideOperationTest {
    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Start DivideOperationTest");
    }

    @Test
    public void testExecute(){
        float i = 8;
        float j = 2;
        ArrayList<Float> listNumber = new ArrayList<Float>();
        listNumber.add(i);
        listNumber.add(j);

        DivideOperation divide = new DivideOperation();
        divide.setListNumber(listNumber);
        divide.execute();
        Assert.assertEquals("Divide not good",
                4, divide.getResult(), 0.0);
    }

    @Test (expected = ArithmeticException.class)
    public void testExecuteWithZero() {
        float i = 8;
        float j = 0;
        ArrayList<Float> listNumber = new ArrayList<Float>();
        listNumber.add(i);
        listNumber.add(j);

        DivideOperation divide = new DivideOperation();
        divide.setListNumber(listNumber);
        divide.execute();
        Assert.assertEquals("Divide not good",
                4, divide.getResult(), 0.0);
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("End DivideOperationTest");
    }
}
