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
        super.numberOfParams = 2;
    }

    /**
     * Execute Sub operation.
     * @return result of addition
     */
    @Override
    public final float execute() {
        float result = listNumber.get(0);
        result -= this.listNumber.get(1);
        return result;
    }

    /**
     * Number of values to sub.
     * @return
     */
    @Override
    public final int getNumberOfParams() {
        return super.getNumberOfParams();
    }
}
