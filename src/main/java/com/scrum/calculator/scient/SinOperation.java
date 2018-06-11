package com.scrum.calculator.scient;

import com.scrum.calculator.core.AbstractOperation;

/**
 * Class Subtraction.
 * @author ida
 */
public class SinOperation extends AbstractOperation {
    /**
     * Constructor.
     */
    public SinOperation() {
        super();
        super.setNumberOfParams(1);
    }

    /**
     * Execute Sin operation.
     * @return result of cos
     */
    @Override
    public final void execute() {
        double result = Math.sin(this.getListNumber().get(0));
        this.setResult((float)result);
    }

    /**
     * ToString of sinus operation.
     * @return string of a sinus operation
     */
    @Override
    public String toStringOperation() {
        return " Sin(" + this.getListNumber().get(0) + ")"
                + " = " + this.getResult();
    }
}
