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

import com.scrum.calculator.core.AbstractOperation;

/**
 * Class Subtraction.
 * @author tsupio
 */
public class SubOperation extends AbstractOperation {
    /**
     * Constructor.
     */
    public SubOperation() {
        super();
    }

    /**
     * Execute Sub operation.
     */
    @Override
    public final void execute() throws ArithmeticException {
        float result = this.getListNumber().get(0);
        result -= this.getListNumber().get(1);
        this.setResult(result);
    }

    /**
     * ToString of subtraction.
     * @return string of a subtraction
     */
    @Override
    public String toString() {
        return this.getListNumber().get(0) + " - " + this.getListNumber().get(1)
                + " = " + this.getResult();
    }
}
