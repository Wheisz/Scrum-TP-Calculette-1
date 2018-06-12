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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to invoke an operation.
 * @author Théodore SUPIOT
 */
public class InvokeOperation {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * List of invoked operation to keep an history.
     */
    private final List<AbstractOperation> history;

    /**
     * Constructor.
     */
    public InvokeOperation() {
        LOGGER.debug(this.getClass().getName() + " - Constructor");
        this.history = new ArrayList<>();
    }

    /**
     * Store the operation in history then execute it.
     * @param operation Operation to store and execute
     */
    public final void storeAndExecute(final AbstractOperation operation) {

        LOGGER.info(this.getClass().getName()
                + "storeAndExecute operation : "
                + operation.getClass().getName());

        operation.execute();
        this.history.add(operation);
    }

    /**
     * Getter history property.
     * @return history of operations
     */
    public final List<AbstractOperation> getHistory() {
        LOGGER.debug(this.getClass().getName() + " - getHistory()");
        return this.history;
    }

    /**
     * String of the history of operations.
     * @return the string for an history
     */
    public final String toStringHistory() {
        LOGGER.debug(this.getClass().getName() + " - toStringHistory()");
        String result = "";
        for (int i = 0; i < this.history.size(); i++) {
            result += "Op�ration n� " + i + " : "
                    + this.history.get(i).toStringOperation()
                    + System.lineSeparator();
        }
        if (this.history.isEmpty()) {
           result = "Aucun historique";
        }
        return result;
    }

    /**
     * String of the history of operations.
     * @return the string for an history
     */
    public final String clearHistory() {
        LOGGER.debug(this.getClass().getName() + " - clearHistory()");
        String result = "";
        this.history.clear();
        result = "Historique effacé";
        return result;
    }
}
