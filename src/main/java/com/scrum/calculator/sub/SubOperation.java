package com.scrum.calculator.sub;

import com.scrum.calculator.core.Operation;

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
        super.setNumberOfParams(2);
    }

    /**
     * Execute Sub operation.
     * @return result of addition
     */
    @Override
    public final float execute() {
        float result = this.getListNumber().get(0);
        result -= this.getListNumber().get(1);
        return result;
    }

}
