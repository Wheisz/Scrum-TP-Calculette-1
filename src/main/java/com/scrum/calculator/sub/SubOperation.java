package com.scrum.calculator.sub;

import com.scrum.calculator.core.Operation;

import java.util.ArrayList;

/**
 * Subtraction.
 * @author tsupio
 */
public class SubOperation extends Operation {
    /**
     * Constructor.
     */
    public SubOperation() {
        super();
        super.numberOfParameters = 2;
    }

    /**
     * Execute Sub operation.
     * @param listNumber list of values to subtract
     * @return result of addition
     */
    @Override
    public final float execute(final ArrayList<Float> listNumber) {
        float result = listNumber.get(0);
        result -= listNumber.get(1);
        return result;
    }

    /**
     * Number of values to sub.
     * @return
     */
    @Override
    public final int getNumberOfParameters() {
        return super.getNumberOfParameters();
    }
}
