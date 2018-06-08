package com.scrum.calculator.add;

import com.scrum.calculator.core.Operation;

import java.util.ArrayList;

/**
 * Addition.
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
