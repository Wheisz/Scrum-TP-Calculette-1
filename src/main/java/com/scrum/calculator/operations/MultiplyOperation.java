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

package com.scrum.calculator.operations;

import com.scrum.calculator.core.AbstractOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class Multiply.
 * @author tsupio
 */
public class MultiplyOperation extends AbstractOperation {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Constructor.
     */
    public MultiplyOperation() {
        super();
        LOGGER.debug(this.getClass().getName() + " - Constructor");
    }

    /**
     * Execute multiplication operation.
     */
    @Override
    public final void execute() throws ArithmeticException {
        LOGGER.info(this.getClass().getName() + " - Exécution multiplication");
        float result;
        result = this.getListNumber().get(0) * this.getListNumber().get(1);
        this.setResult(result);
    }

    /**
     * ToString of multiplication.
     * @return string of a multiplication
     */
    @Override
    public final String toStringOperation() {
        LOGGER.debug(this.getClass().getName() + " - toStringOperation()");
        return this.getListNumber().get(0) + " * " + this.getListNumber().get(1)
                + " = " + this.getResult();
    }
}
