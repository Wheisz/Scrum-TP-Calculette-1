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
import java.util.List;

/**
 * Class to invoke an operation.
 * @author Théodore SUPIOT
 */
public class InvokeOperation {

    /**
     * List of invoked operation to keep an history.
     */
    private final List<AbstractOperation> history;

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
    public final void storeAndExecute(final AbstractOperation operation) {
        this.history.add(operation);
        operation.execute();
    }

    /**
     * Getter history property.
     * @return history of operations
     */
    public final List<AbstractOperation> getHistory() {
        return this.history;
    }

    /**
     * String of the history of operations
     * @return the string for an history
     */
    public final String toStringHistory() {
        String result = "";
        for (int i = 0; i < this.history.size(); i++) {
            result += "Opération n° " + i + " : "
                    + this.history.get(i).toStringOperation()
                    + System.lineSeparator();
        }
        return result;
    }
}
