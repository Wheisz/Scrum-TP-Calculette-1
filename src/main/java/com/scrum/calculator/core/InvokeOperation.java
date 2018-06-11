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

import java.util.ArrayList;

/**
 * Class to invoke an operation.
 * @author Théodore SUPIOT
 */
public class InvokeOperation {

    /**
     * List of invoked operation to keep an history.
     */
    private ArrayList<AbstractOperation> history;

    /**
     * Constructor.
     */
    public InvokeOperation() {
        this.history = new ArrayList<>();
    }

    /**
     * Store the operation in history then execute it.
     * @param operation Operation to store and execute
     */
    public void storeAndExecute(AbstractOperation operation) {
        this.history.add(operation);
        operation.execute();
    }

    public ArrayList<AbstractOperation> getHistory() {
        return this.history;
    }
}
