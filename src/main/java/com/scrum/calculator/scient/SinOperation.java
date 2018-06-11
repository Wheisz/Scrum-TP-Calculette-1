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
     */
    @Override
    public final void execute() {
        double div = 100.0;
        double result = Math.sin(Math.toRadians(
        this.getListNumber().get(0)));
        this.setResult((float) (Math.round(result * div) / div));
    }

    /**
     * ToString of sinus operation.
     * @return string of a sinus operation
     */
    @Override
    public final String toStringOperation() {
        return " Sin(" + this.getListNumber().get(0) + ")"
               + " = " + this.getResult();
    }
}
