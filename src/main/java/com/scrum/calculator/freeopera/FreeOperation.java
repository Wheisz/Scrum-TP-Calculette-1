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

package com.scrum.calculator.freeopera;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mariuszgromada.math.mxparser.Expression;

import com.scrum.calculator.core.AbstractOperation;

/**
 * Class free opeartion.
 * @author tsupio
 */
public class FreeOperation extends AbstractOperation {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Expression calcul.
     */
    private Expression expression;

    /**
     * Constructor.
     */
    public FreeOperation() {
        super();
        super.setNumberOfParams(0);
        LOGGER.debug(this.getClass().getName() + " - Constructor");
    }

    /**
     * ToString of free operation.
     * @return string of an free operation
     */
    @Override
    public final String toStringOperation() {
        LOGGER.debug(this.getClass().getName() + " - toStringOperation()");
        return this.expression.getExpressionString()
                + " = " + Double.toString(this.getResult());
    }

    /**
     * Execute the main method.
     */
    @Override
    public final void execute() {
        LOGGER.info(this.getClass().getName()
                + " - Exécution free operation");

        super.setResult(Float.parseFloat
                (Double.toString(expression.calculate())));
    }

    /**
     * Set the string calcul.
     * @param calcString String to define
     * @throws ArithmeticException cannot execute calcul
     */
    public final void setStringCalc(final String calcString)
            throws ArithmeticException {
        this.expression = new Expression(calcString);

        if (!expression.checkSyntax()) {
            ArithmeticException arithEx = new ArithmeticException(
                    "Chaine de calcul incorrecte.");
            throw arithEx;
        }
    }
}
