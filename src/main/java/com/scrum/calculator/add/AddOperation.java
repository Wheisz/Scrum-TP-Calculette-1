/*
 *  Copyright 2018 - Ida Willy Théodore - M2 - IIA Laval
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
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
