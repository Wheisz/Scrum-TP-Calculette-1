package com.scrum.calculator.percent;

import com.scrum.calculator.core.AbstractOperation;

/**
 * Class Subtraction.
 * @author ida
 */
public class PercentOperation  extends AbstractOperation {
    /**
     * Constructor.
     */
    public PercentOperation() {
        super();
        super.setNumberOfParams(1);
    }

    /**
     * Execute Modulo operation.
     */
    @Override
    public final void execute() {
        float result;
        result = this.getListNumber().get(0) / 100;
        this.setResult(result);
    }

    /**
     * ToString of Modulo operation.
     * @return string of a modulo operation
     */
    @Override
    public final String toStringOperation() {
        return this.getListNumber().get(0) + " Mod = " + this.getResult();
    }
}

