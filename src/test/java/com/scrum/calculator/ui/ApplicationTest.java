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

package com.scrum.calculator.ui;

import com.scrum.calculator.core.Application;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {

    private UserInterface mockUi;
    private Application app;

    @Before
    public void setUp() {
        mockUi = new MockUserInterface();
        app = new Application(mockUi);
    }

    @Test
    public void testDoSetStringOperation() {
       Assert.assertNotNull("The object should not be null", app.doSetStringOperation());
    }

    @Test
    public void testGetChosenOperation() {
        Assert.assertNotNull("The object should not be null", app.getChosenOperation(5));
        
        Assert.assertNull("The object should be null", app.getChosenOperation(89));
    }
    
    @Test
    public void testGetUserFloats(){
        
        List<Float> listOfFloat = app.getUserFloats(2);
        
        Assert.assertEquals("The size should be 2", 2,  listOfFloat.size());
        
        Assert.assertEquals("The value should be 2", "20.2", (listOfFloat.get(0).toString()));
    }
}
