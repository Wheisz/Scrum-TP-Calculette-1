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
        super.numberOfParameters = 2;
    }

    /**
     * Execute Add operation.
     * @param listNumber list of values to add
     * @return result of addition
     */
    @Override
    public final float execute(final ArrayList<Float> listNumber) {
        float result = 0;

        for (int i = 0; i < super.numberOfParameters; i++) {
            result += listNumber.get(i);
        }

        return result;
    }

    /**
     * Number of values to add.
     * @return
     */
    @Override
    public final int getNumberOfParameters() {
        return super.getNumberOfParameters();
    }
}
