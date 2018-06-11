/*
 *  Copyright 2018 - Ida Willy Théodore - M2 - IIA Laval
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.scrum.calculator.add;

import com.scrum.calculator.core.Operation;

/**
 * Class Addition.
 * @author tsupio
 */
public class AddOperation extends Operation {

    /**
     * Constructor.
     */
    public AddOperation() {
        super();
        super.numberOfParams = 2;
    }

    /**
     * Execute Add operation.
     * @return result of addition
     */
    @Override
    public final float execute() {
        float result = 0;

        for (int i = 0; i < super.numberOfParams; i++) {
            result += this.listNumber.get(i);
        }

        return result;
    }

    /**
     * Number of values to add.
     * @return
     */
    @Override
    public final int getNumberOfParams() {
        return super.getNumberOfParams();
    }
}
