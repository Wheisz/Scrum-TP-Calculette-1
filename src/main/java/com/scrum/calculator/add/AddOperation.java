package com.scrum.calculator.add;

import com.scrum.calculator.core.AbstractOperation;

/**
 * Addition.
 * @author tsupio
 */
public class AddOperation extends AbstractOperation {

    /**
     * Constructor.
     */
    public AddOperation() {
        super();
        super.setNumberOfParams(2);
    }

    /**
     * Execute Add operation.
     * @return result of addition
     */
    @Override
    public final float execute() {
        float result = 0;

        for (int i = 0; i < super.getNumberOfParams(); i++) {
            result += this.getListNumber().get(i);
        }

        return result;
    }

}
