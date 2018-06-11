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
    public void testExecute(){
        float i = 2;
        float j = 3;
        ArrayList<Float> listNumber = new ArrayList<Float>();
        listNumber.add(i);
        listNumber.add(j);

        SubOperation sub = new SubOperation();
        sub.setListNumber(listNumber);
        sub.execute();
        Assert.assertEquals("Add not good",
                -1, sub.getResult(), 0.0);
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("End SubOperationTest");
    }
}
