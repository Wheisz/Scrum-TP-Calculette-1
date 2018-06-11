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

package com.scrum.calculator.divide;

import com.scrum.calculator.core.AbstractOperation;

/**
 * Class Divide operation.
 * @author tsupio
 */
public class DivideOperation extends AbstractOperation {
    /**
     * Constructor.
     */
    public DivideOperation() {
        super();
        super.setNumberOfParams(2);
    }

    /**
     * Execute divide operation.
     * @return result of divide
     */
    @Override
    public final float execute() throws ArithmeticException {
        float result;
        if (listNumber.get(1) == 0) {
            throw new ArithmeticException("Division by zero is impossible. "
                    + "Please change second value");

        }
        result = listNumber.get(0) / listNumber.get(1);
        return result;
    }
}
