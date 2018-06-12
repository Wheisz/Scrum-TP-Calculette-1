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

package com.scrum.calculator.core;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.scrum.calculator.operations.AddOperation;

import java.util.ArrayList;

public class InvokeOperationTest {

    private AbstractOperation operation = new AddOperation();
    private InvokeOperation invoker = new InvokeOperation();

    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        ArrayList<Float> listOfFloat = new ArrayList<>();
        listOfFloat.add(5F);
        listOfFloat.add(5F);
        operation.setListNumber(listOfFloat);
        System.out.println("Start InvokeOperationTest");
    }

    @Test
    public void testStoreAndExecute(){
        invoker.storeAndExecute(operation);
        Assert.assertNotEquals(
                "test StoreAndExecute failed - No execute",
                "",
                operation.getResult());
        Assert.assertNotNull(
                "test StoreAndExecute failed - No history",
                invoker.getHistory());
        Assert.assertNotEquals(
                "test StoreAndExecute failed - No history",
                0,
                invoker.getHistory().size());
    }

    @Test
    public void testGetHistory(){
        Assert.assertNotNull(
                "test testGetHistory failed",
                invoker.getHistory());
    }

    @Test
    public void testToStringHistory(){
        Assert.assertNotEquals(
                "test testToStringHistory failed",
                "",
                operation.getResult());
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("End InvokeOperationTest");
    }
}
