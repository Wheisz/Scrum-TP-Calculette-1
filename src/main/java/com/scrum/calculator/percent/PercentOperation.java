package com.scrum.calculator.percent;

import com.scrum.calculator.core.AbstractOperation;

/**
 * Class Percentage.
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
     * Execute Percentage operation.
     */
    @Override
    public final void execute() {
        float result;
        result = this.getListNumber().get(0) / 100;
        this.setResult(result);
    }

    /**
     * ToString of Percentage operation.
     * @return string of a percentage operation
     */
    @Override
    public final String toStringOperation() {
        return this.getListNumber().get(0) + "% = " + this.getResult();
    }
}

